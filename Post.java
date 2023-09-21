package com.campusdual.javaExercises.season6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public abstract class Post {
    //Attributes
    private Date postDate;
    private List<Comments> commentList = new ArrayList<>();
    private String ID;

    //Constructor
    public Post(Date postDate) {
        this.postDate = postDate;
        this.ID = generateID();
    }

    //Getter and Setter
    public Date getPostDate() {
        return postDate;
    }
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    public List<Comments> getCommentList() {
        return commentList;
    }
    public void setCommentList(List<Comments> commentList) {
        this.commentList = commentList;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    //Post methods
    public String generateID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }


}