package com.example.recyclerviewapp;

public class Posts {
    public Posts(int postID, int accID, String title, String content) {
        this.postID = postID;
        this.accID = accID;
        this.title = title;
        this.content = content;
    }

    private int postID;
    private int accID ;
    private String title ;
    private String content;

    public int getPostID() {
        return postID;
    }

    public int getAccID() {
        return accID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
