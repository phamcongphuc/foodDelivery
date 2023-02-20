package com.example.foodDelivery.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "foods")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String desc;

    @Column(name = "price")
    private int price;

    @Column(name = "instruction")
    private String instruction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL)
    private Set<OrderDetailEntity> orderDetails;

    @OneToMany(mappedBy = "food", cascade = CascadeType.ALL)
    private Set<RatingFoodEntity> ratingFoods;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public Set<OrderDetailEntity> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetailEntity> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Set<RatingFoodEntity> getRatingFoods() {
        return ratingFoods;
    }

    public void setRatingFoods(Set<RatingFoodEntity> ratingFoods) {
        this.ratingFoods = ratingFoods;
    }
}
