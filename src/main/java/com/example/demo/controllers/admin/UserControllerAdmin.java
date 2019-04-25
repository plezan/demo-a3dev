package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controllers.admin.base.BaseAdminController;
import com.example.demo.controllers.admin.base.BaseAdminLinkedController;
import com.example.demo.controllers.utils.UriUtils;
import com.example.demo.entities.User;

@Controller
@RequestMapping(value = {UriUtils.URI_SLASH + BaseAdminController.BASE_ADMIN_CONTROLLER_NAME + UriUtils.URI_SLASH + UserControllerAdmin.USER_CONTROLLER_ADMIN_NAME})
public class UserControllerAdmin extends BaseAdminLinkedController<User> {

    public static final String USER_CONTROLLER_ADMIN_NAME = "user";
    
    protected UserControllerAdmin() {
        super(USER_CONTROLLER_ADMIN_NAME, User.class);
    }

    @Override
    public Boolean checkEquality(User item, Long externalId, String linkedItem) {
        return null;
    }
}
