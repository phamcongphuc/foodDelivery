package com.example.foodDelivery.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "restaurants")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "desc")
    private String desc;

    @Column(name = "address")
    private String address;

    @Column(name = "rating")
    private String rating;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Category_Res",
            joinColumns = @JoinColumn(name = "restaurant_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<CategoryEntity> categories = new HashSet<>();

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CouponEntity> coupons = new HashSet<>();

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RatingResEntity> ratings = new HashSet<>();

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Set<CategoryEntity> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryEntity> categories) {
        this.categories = categories;
    }

    public Set<CouponEntity> getCoupons() {
        return coupons;
    }

    public void setCoupons(Set<CouponEntity> coupons) {
        this.coupons = coupons;
    }

    public Set<RatingResEntity> getRatings() {
        return ratings;
    }

    public void setRatings(Set<RatingResEntity> ratings) {
        this.ratings = ratings;
    }
}
