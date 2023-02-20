package com.example.foodDelivery.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "categorys")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String desc;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<FoodEntity> foods = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
    private Set<RestaurantEntity> restaurants = new HashSet<>();

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set<FoodEntity> getFoods() {
        return foods;
    }

    public void setFoods(Set<FoodEntity> foods) {
        this.foods = foods;
    }

    public Set<RestaurantEntity> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<RestaurantEntity> restaurants) {
        this.restaurants = restaurants;
    }
}
