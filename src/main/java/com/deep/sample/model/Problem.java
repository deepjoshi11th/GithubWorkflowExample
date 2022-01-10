package com.deep.sample.model;


public class Problem {
    private String title;
    private String descriptionValue;

    /**
     * it is constructor here.
     */

    public Problem() {
    }

    /**
     * problem is defined here.
     * @param title
     * @param descriptionValue
     */

    public Problem(String title, String descriptionValue) {
        this.title = title;
        this.descriptionValue = descriptionValue;
    }

    /**
     * this is  gettitle method.
     * @return it is returning the value
     */

    public String getTitle() {
        return title;
    }

    /**
     * setTitle declared here.
     * @param title
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getDescriptionValue here.
     * @return returning the value.
     */

    public String getDescriptionValue() {
        return descriptionValue;
    }

    /**
     * it is comment.
     * @param descriptionValue
     */

    public void setDescriptionValue(String descriptionValue) {
        this.descriptionValue = descriptionValue;
    }
}
