package com.example.labtest02.Domains;

import java.io.Serializable;

public class PopularDomain implements Serializable {

    private String title;
    private String location;
    private String deccription;
    private int bed;
    private boolean guide;
    private double score;
    private String pic;
    private boolean wifi;
    private int price;

    public PopularDomain(String title, String location, String deccription, int bed, boolean guide, double score, String pic, boolean wifi, int price) {
        this.title = title;
        this.location = location;
        this.deccription = deccription;
        this.bed = bed;
        this.guide = guide;
        this.score = score;
        this.pic = pic;
        this.wifi = wifi;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDeccription() {
        return deccription;
    }

    public void setDeccription(String deccription) {
        this.deccription = deccription;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public boolean isGuide() {
        return guide;
    }

    public void setGuide(boolean guide) {
        this.guide = guide;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
