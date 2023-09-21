package com.campusdual.javaExercises.season6;

import com.campusdual.Utils;
import java.util.ArrayList;
import java.util.List;


public class User {
    private String userName;
    protected List<User> usersFollowed = new ArrayList<>();
    private List<Post> userPosts = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        userName = userName;
    }
    public List<User> getUsersFollowed() {
        return usersFollowed;
    }
    public void setUsersFollowed(List<User> usersFollowed) {
        this.usersFollowed = usersFollowed;
    }
    public List<Post> getUserPosts() {
        return userPosts;
    }
    public void setUserPosts(List<Post> userPosts) {
        this.userPosts = userPosts;
    }

    public void addFriend(User user){
        this.getUsersFollowed().add(user);
        //System.out.println(this.getUsersFollowed());
    }

    public void removeFriend(User user){
        this.getUsersFollowed().remove(user);
        //System.out.println(this.getUsersFollowed());
    }
}