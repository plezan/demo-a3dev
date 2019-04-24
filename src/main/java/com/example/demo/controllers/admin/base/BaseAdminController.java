package com.example.demo.controllers.admin.base;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.database.base.DbEntity;
import com.example.demo.entities.User;

public abstract class BaseAdminController<T extends DbEntity> implements CrudController<T> {

    public static final String BASE_ADMIN_CONTROLLER_NAME = "admin";
    
    private final String controllerName;
    
    protected BaseAdminController(final String controllerName) {
        this.controllerName = controllerName;
    }
    
    @Override
    @RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        return "/" + this.controllerName + "/index";
    }

    @Override
    @RequestMapping(value = {"/insert"}, method = RequestMethod.GET)
    public String insert(@ModelAttribute T item) {
        return "/" + this.controllerName + "/insert";
    }

    @Override
    @RequestMapping(value = {"/update"}, method = RequestMethod.GET)
    public String update(@ModelAttribute T item) {
        return "/" + this.controllerName + "/update";
    }

    @Override
    @RequestMapping(value = {"/delete"}, method = RequestMethod.GET)
    public String delete(@ModelAttribute T item) {
        return "/" + this.controllerName + "/delete";
    }

    @Override
    @RequestMapping(value = {"/delete/{id}"}, method = RequestMethod.GET)
    public String delete(@PathVariable Long id) {
        return "/" + this.controllerName + "/delete";
    }

    @Override
    @RequestMapping(value = {"/details"}, method = RequestMethod.GET)
    public String details(@ModelAttribute T item) {
        return "/" + this.controllerName + "/details";
    }

    @Override
    @RequestMapping(value = {"/details/{id}"}, method = RequestMethod.GET)
    public String details(@PathVariable Long id) {
        return "/" + this.controllerName + "/details";
    }

    @Override
    @RequestMapping(value = {"/list/insert"}, method = RequestMethod.GET)
    public String insert(@ModelAttribute List<T> items) {
        return "/" + this.controllerName + "/insert";
    }

    @Override
    @RequestMapping(value = {"/list/update"}, method = RequestMethod.GET)
    public String update(@ModelAttribute List<T> items) {
        return "/" + this.controllerName + "/update";
    }

    @Override
    @RequestMapping(value = {"/list/delete"}, method = RequestMethod.GET)
    public String delete(@ModelAttribute List<T> items) {
        return "/" + this.controllerName + "/delete";
    }

    @Override
    @RequestMapping(value = {"/list/delete/{ids}"}, method = RequestMethod.GET)
    public String delete(@PathVariable Long[] ids) {
        return "/" + this.controllerName + "/delete";
    }

    @Override
    @RequestMapping(value = {"/list/details"}, method = RequestMethod.GET)
    public String details(@ModelAttribute List<T> item) {
        return "/" + this.controllerName + "/details";
    }

    @Override
    @RequestMapping(value = {"/list/details/{ids}"}, method = RequestMethod.GET)
    public String details(@PathVariable Long[] id) {
        return "/" + this.controllerName + "/details";
    }
}
