package com.MediaModel;

import javax.persistence.*;

@Entity
@Table (name = "Media")
public class Media {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private float price;
    private String category;
    private int quantity;

    public Media(){

    }

    public Media(Integer id, String title, String category, float price, int quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer code) {
        this.id = code;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id='" + id + '\'' +
                ", name='" + title + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
