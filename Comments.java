package com.campusdual.javaExercises.season6;

import com.campusdual.Utils;

import java.util.Date;

public class Comments {
    //Attributes
    private String commentText;
    private Date commentDate;
    private User commentOwner;
    private Post postCommentOwner;

    //Getter and Setter
    public String getCommentText() {
        return commentText;
    }
    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
    public Date getCommentDate() {
        return commentDate;
    }
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
    public User getCommentOwner() {
        return commentOwner;
    }
    public void setCommentOwner(User commentOwner) {
        this.commentOwner = commentOwner;
    }
    public Post getPostCommentOwner() {
        return postCommentOwner;
    }
    public void setPostCommentOwner(Post postCommentOwner) {
        this.postCommentOwner = postCommentOwner;
    }

    //Constructor
    public Comments(String commentText, Date commentDate, User commentOwner, Post postCommentOwner) {
        this.commentText = commentText;
        this.commentDate = commentDate;
        this.commentOwner = commentOwner;
        this.postCommentOwner = postCommentOwner;
    }

    //Add, remove and list method
    //ADD COMMENT
    public static String string() {
        return "";
    }

    //REMOVE COMMENT
    public void removeComment() {

    }

    //LIST COMMENT
    public void listComment() {

    }
}