package com.briup.cms.com.briup.service.impl;

import com.briup.cms.com.briup.bean.Link;
import com.briup.cms.com.briup.dao.LinkDao;
import com.briup.cms.com.briup.exception.CustomerException;
import com.briup.cms.com.briup.service.ILinkService;
import com.briup.cms.com.briup.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements ILinkService {

    @Autowired
    private LinkDao linkDao;

    @Override
    public void addLink(Link link) throws CustomerException {
        if(link == null){
            throw  new CustomerException(CodeUtil.PARAM_NULL,"参数异常");
        }
          linkDao.save(link);
    }

    @Override
    public List<Link> selectAll() throws CustomerException {

        List<Link> all = linkDao.findAll();
        return all;
    }

    @Override
    public void delectById(Integer id) throws CustomerException {
        linkDao.deleteById(id);
    }


}
