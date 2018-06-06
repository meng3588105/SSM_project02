package com.mmm;

import com.mmm.bean.Invitation;
import com.mmm.service.InvitationService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class aa {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-*.xml");
        InvitationService invitationService = context.getBean("invitationServiceImpl", InvitationService.class);
        List<Invitation> invitations = invitationService.finAll();
        System.out.println(invitations);


    }
}