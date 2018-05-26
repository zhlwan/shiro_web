package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/2.
 */
public class Product implements Serializable {
    private Integer id;
    private String name;
    private String desc;
    private Double price;
    private String imagePath;
    private String date;
    private String location;


    public Product() {
    }

    public Product(Integer id, String name, String desc, Double price, String imagePath, String date, String location) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.imagePath = imagePath;
        this.date = date;
        this.location = location;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", imagePath='" + imagePath + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}





