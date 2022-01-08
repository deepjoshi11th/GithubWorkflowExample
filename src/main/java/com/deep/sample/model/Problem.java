package com.deep.sample.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

public class Problem {
    private String title;
    private String descriptionValue;

    public Problem() {
    }

    public Problem(String title, String descriptionValue) {
        this.title = title;
        this.descriptionValue = descriptionValue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptionValue() {
        return descriptionValue;
    }

    public void setDescriptionValue(String descriptionValue) {
        this.descriptionValue = descriptionValue;
    }
}
