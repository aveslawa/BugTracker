package com.company.entities;

import java.io.Serializable;

/**
 * Created by Viachaslau.
 */
public class Project implements Serializable {
    private long id;
    private String title;
    private String dataCreated;
    private String author;

    public Project(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Project(long id, String title, String dataCreated, String author) {
        this.id = id;
        this.title = title;
        this.dataCreated = dataCreated;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(String dataCreated) {
        this.dataCreated = dataCreated;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dataCreated='" + dataCreated + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

