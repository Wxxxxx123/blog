package com.xyhy.blog.items;

public class ArticleWithBLOBs extends Article {
    private String content;

    private String contentMk;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getContentMk() {
        return contentMk;
    }

    public void setContentMk(String contentMk) {
        this.contentMk = contentMk == null ? null : contentMk.trim();
    }
}