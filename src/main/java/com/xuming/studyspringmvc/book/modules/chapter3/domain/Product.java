package com.xuming.studyspringmvc.book.modules.chapter3.domain;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class Product {

    private String name;

    private String description;

    private Float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
