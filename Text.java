package com.campusdual.javaExercises.season6;

import java.util.Calendar;
import java.util.Date;

public class Text extends Post {
    private String textTitle;
    private String textContent;

    public String getTextTitle() {
        return textTitle;
    }
    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }
    public String getTextContent() {
        return textContent;
    }
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public Text(Date postDate, String textTitle, String textContent) {
        super(postDate);
        this.textTitle = textTitle;
        this.textContent = textContent;
    }

    public void addText() {

    }

    @Override
    public String toString(){
        return this.getTextTitle() + " "+ this.getTextContent() + " "+ this.getPostDate() + " "+ this.getID();
    }

}
