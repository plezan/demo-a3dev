package com.example.demo.controllers.admin;

import com.example.demo.entities.Role;
import com.example.demo.entities.utils.EntitiesMapping;
import org.springframework.stereotype.Controller;
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

        if( linkedItem == EntitiesMapping.JOB_TO_USER){
            if (item.getJob().getId().equals(externalId)) {
                return true;
            }
        } else if( linkedItem == EntitiesMapping.ROLE_TO_USER) {
            for (Role role : item.getRoles()) {
                if (role.getId().equals(externalId)) {
                    return true;
                }
            }
        }
        return false;
    }
}
