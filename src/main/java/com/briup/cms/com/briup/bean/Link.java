package com.briup.cms.com.briup.bean;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cms_link")
public class Link implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @ApiModelProperty(value = "连接Id")
    private int id;

   @ApiModelProperty(value = "连接名字",required = true)
   private  String name;

   @ApiModelProperty(value = "链接地址",required = true)
   private String url;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
