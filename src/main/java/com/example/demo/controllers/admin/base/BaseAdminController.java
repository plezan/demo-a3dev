package com.example.demo.controllers.admin.base;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.PermitAll;
import javax.validation.constraints.NotNull;

import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.controllers.utils.MappedRoutes;
import com.example.demo.controllers.utils.UriUtils;
import com.example.demo.database.base.DbEntity;

public abstract class BaseAdminController<T extends DbEntity> implements CrudController<T> {

    public static final String BASE_ADMIN_CONTROLLER_NAME = "admin";
    
    public final String controllerName;
    public final Class klazz;
    private String indexPath;
    private String detailsPath;
    
    @Autowired
    protected JpaRepository<T, Long> repository;
    
    protected BaseAdminController(final String controllerName, Class klazz) {
        this.controllerName = controllerName;
        this.klazz = klazz;
        this.indexPath = UriUtils.URI_SLASH + this.controllerName + UriUtils.URI_INDEX_PATH;
        this.detailsPath = UriUtils.URI_SLASH + this.controllerName + UriUtils.URI_DETAILS_PATH;
        
        String basePath = UriUtils.URI_SLASH + BaseAdminController.BASE_ADMIN_CONTROLLER_NAME +
                UriUtils.URI_SLASH + controllerName;
        List<String> datas = new ArrayList<String>();
        datas.add(basePath + UriUtils.URI_SLASH);
        datas.add(basePath + UriUtils.URI_INDEX_PATH);
        datas.add(basePath + UriUtils.URI_DETAILS_PATH);
        datas.add(basePath + UriUtils.URI_DETAILS_ID_PATH);
        
        MappedRoutes.getInstance().getRoutes().put(klazz, datas);
    }
    
    @Override
    @RequestMapping(value = {UriUtils.URI_SLASH,UriUtils.URI_INDEX_PATH}, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("items",this.repository.findAll());
        return this.indexPath;
    }
    
    @Override
    @RequestMapping(value = {UriUtils.URI_DETAILS_PATH}, method = RequestMethod.GET)
    public String details(Model model) {
        return this.detailsPath;
    }

    @Override
    @RequestMapping(value = {UriUtils.URI_DETAILS_ID_PATH}, method = RequestMethod.GET)
    public String details(Model model, @PathVariable @NotNull Long id) {
        model.addAttribute("item",this.repository.getOne(id));
        return this.detailsPath;
    }


    @RequestMapping(value = {UriUtils.URI_DELETE_ID_PATH}, method = RequestMethod.DELETE)
    public String delete(@PathVariable @NotNull Long id){
        this.repository.deleteById(id);
        return this.detailsPath;
    }

    @RequestMapping(value = {UriUtils.URI_PURGE_PATH}, method = RequestMethod.DELETE)
    public String purge(){
        this.repository.deleteAll();
        return this.detailsPath;
    }

    @RequestMapping(value = {UriUtils.URI_UPDATE_ID_PATH}, method = RequestMethod.PUT)
    public String put(Model model, @PathVariable @NotNull Long id){
        model.addAttribute("item",
                this.repository.save(
                    this.repository.getOne(id)
                )
        );
        return  this.detailsPath;
    }





}
