package com.campusdual.javaExercises.season6;

import java.util.Date;

public class Video extends Post {
    private String title;
    private String videoQuality;
    private String duration;

    //Getter and Setter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getVideoQuality() {
        return videoQuality;
    }
    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

    //Constructor
    public Video(Date postDate, String title, String videoQuality, String duration) {
        super(postDate);
        this.title = title;
        this.videoQuality = videoQuality;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return this.getTitle() + " "+ this.getVideoQuality() + " "+ this.getDuration() + " " + this.getPostDate() + " "+ this.getID();
    }

}
