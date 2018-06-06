package com.mmm.bean;

import java.io.Serializable;
import java.util.Date;

public class Reply_detail implements Serializable {

    private int id;//编号
    private int invid;//帖子编号（对应帖子表的主键）
    private String content;//回复内容
    private String author;//回复人昵称
    private Date createdate;//发布时间

    @Override
    public String toString() {
        return "Reply_detail{" +
                "id=" + id +
                ", invid=" + invid +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createdate=" + createdate +
                '}';
    }

    public Reply_detail() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvid() {
        return invid;
    }

    public void setInvid(int invid) {
        this.invid = invid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Reply_detail(int id, int invid, String content, String author, Date createdate) {
        this.id = id;
        this.invid = invid;
        this.content = content;
        this.author = author;
        this.createdate = createdate;
    }
}
