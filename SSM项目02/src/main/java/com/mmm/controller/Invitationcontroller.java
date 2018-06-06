package com.mmm.controller;

import com.google.gson.Gson;
import com.mmm.bean.Invitation;
import com.mmm.service.InvitationService;
import com.mmm.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/findAlls")
public class Invitationcontroller {

    @Autowired
    private InvitationService invitationService;

        @RequestMapping("/aa")
        public void add(HttpServletRequest req){
            System.out.println("进入了Modeladd");
            PageInfo<Invitation> news = invitationService.findAlls(
                    Integer.parseInt(req.getParameter("pageNum")), 3);
            Gson gson = new Gson();
            String json = gson.toJson(news);
            System.out.println(json);

        }
    @RequestMapping("/all")
    public void find(HttpServletRequest req,HttpServletResponse response){
        System.out.println("进入了Modeladd");
        List<Invitation> invitations = invitationService.finAll();
        Gson gson = new Gson();
        String json = gson.toJson(invitations);
        try {
            PrintWriter writer=response.getWriter();
            writer.print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(json);

    }


}
