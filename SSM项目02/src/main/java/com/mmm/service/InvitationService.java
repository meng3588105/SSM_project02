package com.mmm.service;

import com.mmm.bean.Invitation;
import com.mmm.util.PageInfo;

import java.io.Serializable;
import java.util.List;

public interface InvitationService  {

    List<Invitation> finAll();

    PageInfo<Invitation> findAlls(int pageNum, int pageSize);



}
