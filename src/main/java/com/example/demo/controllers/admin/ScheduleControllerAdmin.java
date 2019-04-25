package com.example.demo.controllers.admin;

import com.example.demo.controllers.admin.base.BaseAdminController;
import com.example.demo.controllers.admin.base.BaseAdminLinkedController;
import com.example.demo.controllers.utils.UriUtils;
import com.example.demo.entities.Schedule;
import com.example.demo.entities.utils.EntitiesMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {UriUtils.URI_SLASH + BaseAdminController.BASE_ADMIN_CONTROLLER_NAME + UriUtils.URI_SLASH + ScheduleControllerAdmin.SCHEDULE_CONTROLLER_ADMIN_NAME})
public class ScheduleControllerAdmin extends BaseAdminLinkedController<Schedule> {

    public static final String SCHEDULE_CONTROLLER_ADMIN_NAME = "schedule";

    protected ScheduleControllerAdmin() {
        super(SCHEDULE_CONTROLLER_ADMIN_NAME, Schedule.class);
    }

    @Override
    public Boolean checkEquality(Schedule item, Long externalId, String linkedItem) {

        if(linkedItem == EntitiesMapping.JOB_TO_SCHEDULE){
            if (item.getJob().equals(externalId)) {
                return true;
            }
        }
        return false;
    }}
