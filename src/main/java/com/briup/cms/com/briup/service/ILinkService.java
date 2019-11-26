package com.briup.cms.com.briup.service;

import com.briup.cms.com.briup.bean.Link;
import com.briup.cms.com.briup.exception.CustomerException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ILinkService {
    void addLink(Link link ) throws CustomerException;
    List<Link> selectAll() throws  CustomerException;
    void delectById(Integer id) throws CustomerException;
}
