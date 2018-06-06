package com.mmm.service.impl;

import com.mmm.bean.Invitation;
import com.mmm.dao.InvitationMapper;
import com.mmm.service.InvitationService;
import com.mmm.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
@Service
public class InvitationServiceImpl implements InvitationService {

    @Autowired
    private InvitationMapper invitationMapper;


    @Override
    public List<Invitation> finAll() {
        return invitationMapper.finAll();
    }

    @Override
    public PageInfo<Invitation> findAlls(int pageNum, int pageSize) {
        PageInfo<Invitation> pageInfo = new PageInfo<>();
        // 给pageInfo对象的list集合赋值
        pageInfo.setList(invitationMapper.findAlls(pageNum, pageSize));
        return pageInfo;

    }


}
