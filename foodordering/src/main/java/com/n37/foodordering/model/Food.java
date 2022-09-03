package com.n37.foodordering.model;

import java.util.Date;

public class Food {
   
    private Integer id;

    private String name;

   
    private Date uploadTime;

    
    private String decription;

   
    private String image;

   
    private Long unitPrice;

    
    private Byte status;

    
    private String category;

   
    private Integer restaurantId;

   
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

    
    public Date getUploadTime() {
        return uploadTime;
    }

    
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getDecription() {
        return decription;
    }

    
    public void setDecription(String decription) {
        this.decription = decription;
    }

    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    
    public Long getUnitPrice() {
        return unitPrice;
    }

   
    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    
    public Byte getStatus() {
        return status;
    }

    
    public void setStatus(Byte status) {
        this.status = status;
    }

    
    public String getCategory() {
        return category;
    }

   
    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }
}