package com.briup.cms.com.briup.web.controller;

import com.briup.cms.com.briup.bean.Link;
import com.briup.cms.com.briup.service.ILinkService;
import com.briup.cms.com.briup.util.Message;
import com.briup.cms.com.briup.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/link")
@Api(description = "连接管理")
public class LinkController {

    @Autowired
    private ILinkService linkService;
    @PostMapping("/add")
    @ApiOperation("添加连接")
    public Message<Object> addLink(Link link) {
       linkService.addLink(link);
       return MessageUtil.success();
    }

    @GetMapping("/getAll")
    @ApiOperation("获取所有")
    public Message<List<Link>> selectLink(){
        List<Link> links = linkService.selectAll();
        return MessageUtil.success(links);
    }

    @PostMapping("/update")
    @ApiOperation("更新")
    public Message updateLink(Link link){
        linkService.addLink(link);
        return  MessageUtil.success();
    }


    @PostMapping("/delect")
    @ApiModelProperty("删除")
    public Message delectById(Integer id){
        linkService.delectById(id);
        return  MessageUtil.success();
    }

}
