package com.campusdual.javaExercises.season6;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class Image extends Post {
    private String imageTitle;
    private String imageDimension;

    public String getImageTitle() {
        return imageTitle;
    }
    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }
    public String getImageDimension() {
        return imageDimension;
    }
    public void setImageDimension(String imageDimension) {
        this.imageDimension = imageDimension;
    }

    public Image(Date postDate, String imageTitle, String imageDimension) {
        super(postDate);
        this.imageTitle = imageTitle;
        this.imageDimension = imageDimension;
    }

    @Override
    public String toString(){
        return getImageTitle() + " "+ getImageDimension() + " "+ getPostDate() + " "+ getID();
    }
}
