package com.n37.foodordering.model;

import java.util.Date;

public class Comment {
  
    private Integer id;

    
    private String content;

    
    private Integer foodId;

   
    private Integer userId;

   
    private Date createdDate;

   
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

  
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    public Integer getFoodId() {
        return foodId;
    }

   
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
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
}