package com.github.nrudenko.orm.example.model;

import com.github.nrudenko.orm.annotation.Table;

import java.util.Date;

@Table
public class ExampleModel {

    String text;
    Date date;
    int intVal;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }
}
