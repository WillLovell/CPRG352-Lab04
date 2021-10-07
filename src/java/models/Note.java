package models;

import java.io.Serializable;

public class Note implements Serializable {
    private String Title;
    private String content;

    public Note() {
        this.Title = "";
        this.content = "";     
    }

    
    
    
    public Note(String Title, String content) {
        this.Title = Title;
        this.content = content;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getcontent() {
        return content;
    }

    public void setcontent(String content) {
        this.content = content;
    }
    
    
    
    
    
}
