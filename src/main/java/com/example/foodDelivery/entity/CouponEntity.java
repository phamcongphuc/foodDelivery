package com.example.foodDelivery.entity;

import javax.persistence.*;

@Entity(name = "coupon")
public class CouponEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private int code;

    @Column(name = "desc")
    private String desc;

    @Column(name = "discount")
    private int discount;

    //    @Column(name = "cate_res_id")
//    private int cate_res_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cate_res_id")
    private CategoryEntity categoryRestaurant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public CategoryEntity getCategoryRestaurant() {
        return categoryRestaurant;
    }

    public void setCategoryRestaurant(CategoryEntity categoryRestaurant) {
        this.categoryRestaurant = categoryRestaurant;
    }
}
