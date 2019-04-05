package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controllers.admin.base.BaseAdminController;
import com.example.demo.entities.User;

@Controller
@RequestMapping(value = {"/" + BaseAdminController.BASE_ADMIN_CONTROLLER_NAME + "/" + UserControllerAdmin.USER_CONTROLLER_ADMIN_NAME})
public class UserControllerAdmin extends BaseAdminController<User> {

    public static final String USER_CONTROLLER_ADMIN_NAME = "user";
    
    protected UserControllerAdmin() {
        super(USER_CONTROLLER_ADMIN_NAME);
    }
}
