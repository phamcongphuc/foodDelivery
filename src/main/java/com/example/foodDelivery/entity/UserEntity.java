package com.example.foodDelivery.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "address")
    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    private RoleEntity role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<OrderEntity> orders = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RatingFoodEntity> ratings = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RatingOrderEntity> ratingOrders = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<RatingResEntity> ratingRess = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public Set<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderEntity> orders) {
        this.orders = orders;
    }

    public Set<RatingFoodEntity> getRatings() {
        return ratings;
    }

    public void setRatings(Set<RatingFoodEntity> ratings) {
        this.ratings = ratings;
    }

    public Set<RatingOrderEntity> getRatingOrders() {
        return ratingOrders;
    }

    public void setRatingOrders(Set<RatingOrderEntity> ratingOrders) {
        this.ratingOrders = ratingOrders;
    }

    public Set<RatingResEntity> getRatingRess() {
        return ratingRess;
    }

    public void setRatingRess(Set<RatingResEntity> ratingRess) {
        this.ratingRess = ratingRess;
    }
}
