package com.example.telegram_appearance_java.model;

public class Theme {
    private int imgBack;
    private int img1;
    private int img2;
    private int img3;

    public Theme(int imgBack, int img1, int img2, int img3) {
        this.imgBack = imgBack;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
    }

    public int getImgBack() {
        return imgBack;
    }

    public void setImgBack(int imgBack) {
        this.imgBack = imgBack;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public int getImg3() {
        return img3;
    }

    public void setImg3(int img3) {
        this.img3 = img3;
    }
}
