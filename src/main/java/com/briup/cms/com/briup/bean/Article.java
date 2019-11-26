package com.briup.cms.com.briup.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cms_article")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   private String author;
   private  int clickTimes;
   private String content;
   private String publishDate;
   private String title;
   private int category_id;

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public int getClickTimes() {
        return clickTimes;
    }

    public String getContent() {
        return content;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getTitle() {
        return title;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setClickTimes(int clickTimes) {
        this.clickTimes = clickTimes;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
