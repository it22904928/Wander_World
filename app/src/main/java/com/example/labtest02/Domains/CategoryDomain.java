package com.example.labtest02.Domains;

import java.io.Serializable;

public class CategoryDomain implements Serializable {

    private String title;
    private String picPath;

    private String deccription;


    public CategoryDomain(String title, String picPath, String deccription) {
        this.title = title;
        this.picPath = picPath;
        this.deccription = deccription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getDeccription() {return deccription;}

    public void setDeccription(String deccription) {this.deccription = deccription;}

}
