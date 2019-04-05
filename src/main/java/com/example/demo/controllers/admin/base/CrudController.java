package com.example.demo.controllers.admin.base;

import java.util.Collection;
import java.util.List;

import org.springframework.ui.Model;

import com.example.demo.database.base.DbEntity;

public interface CrudController <T extends DbEntity> {

    String index(Model model);
    
    String insert(T item);
    String update(T item);
    String delete(T item);
    String delete(Long id);
    String details(T item);
    String details(Long id);
    
    String insert(List<T> items);
    String update(List<T> items);
    String delete(List<T> items);
    String delete(Long[] ids);
    String details(List<T> items);
    String details(Long[] ids);
}
