package com.caio.model;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;

/**
 * Created by caio on 11/06/16.
 */
public class Quote {

    @Id
    private String id;

    private String author;

    private String text;

    private DateTime date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = new DateTime();
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id='" + id + '\'' +
                ", author=" + author +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
