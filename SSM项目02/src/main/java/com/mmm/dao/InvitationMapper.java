package com.mmm.dao;

import com.mmm.bean.Invitation;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface InvitationMapper {

    List<Invitation> finAll();

    List<Invitation> findAlls(int pageNum, int pageSize);

}
