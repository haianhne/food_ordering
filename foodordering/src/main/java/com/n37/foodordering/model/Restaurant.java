package com.n37.foodordering.model;

import java.util.Date;

public class Restaurant {
   
    private Integer id;

    private String name;

   
    private Integer userId;

    
    private Date createdDate;

   
    private String description;

    
    private String image;

  
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

   
    public Integer getUserId() {
        return userId;
    }

    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    public Date getCreatedDate() {
        return createdDate;
    }

    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

   
    public String getImage() {
        return image;
    }

    
    public void setImage(String image) {
        this.image = image;
    }
}