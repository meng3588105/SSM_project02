package com.mmm.bean;

import java.io.Serializable;
import java.util.Date;

public class Invitation implements Serializable {
    private int id;//帖子编号
    private String title;//帖子标题
    private String summary;//帖子摘要
    private String author;//作者
    private Date createdate;//发布时间

    @Override
    public String toString() {
        return "invitation{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", author='" + author + '\'' +
                ", createdate=" + createdate +
                '}';
    }

    public Invitation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Invitation(int id, String title, String summary, String author, Date createdate) {

        this.id = id;
        this.title = title;
        this.summary = summary;
        this.author = author;
        this.createdate = createdate;
    }
}
