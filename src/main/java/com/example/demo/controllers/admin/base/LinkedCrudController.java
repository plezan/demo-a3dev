package com.example.demo.controllers.admin.base;

import org.springframework.ui.Model;

import com.example.demo.database.base.DbEntity;

public interface LinkedCrudController<T extends DbEntity>
    extends CrudController<T> {

    /**
     * Outside items navigation.
     * @param model data view forwarder
     * @param id, id of foreign item with PathVariable {id}
     * @param navigationPath, class to map in with PathVariable {navigationPath}
     * @return path to template
     */
    String index(Model model, Long id, String navigationPath);
}
