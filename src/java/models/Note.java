package models;

import java.io.Serializable;

/**
 *
 * @author jerma
 */
public class Note implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String title;
    private String content;

    public Note() {
        this.title = "";
        this.content = "";
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Note{" + "title=" + title + ", content=" + content + '}';
    }
    
    
}
