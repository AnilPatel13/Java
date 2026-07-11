package com.whygo.simple;

import jakarta.persistence.*;

//@Entity(name="device_table")
@Entity
@Table(name="device_table")
public class Device {
    @Id
    private int id;
    @Column(name="device_name")
    private String name;
    private String brand;
    @Transient
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
    }
}
