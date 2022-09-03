package com.n37.foodordering.model;

import java.util.Date;

public class Food_order_detail {
   
    private Integer id;

    
    private Long totalPrice;

   
    private Long shipPrice;

   
    private Date createdDate;

    
    private Date sellTime;

   
    private Integer foodQuantity;

    
    private Integer orderId;

    
    private Integer foodId;

    
    public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Long getTotalPrice() {
        return totalPrice;
    }

   
    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(Long shipPrice) {
        this.shipPrice = shipPrice;
    }

   
    public Date getCreatedDate() {
        return createdDate;
    }

   
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

   
    public Date getSellTime() {
        return sellTime;
    }

    
    public void setSellTime(Date sellTime) {
        this.sellTime = sellTime;
    }

    public Integer getFoodQuantity() {
        return foodQuantity;
    }

   
    public void setFoodQuantity(Integer foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

   
    public Integer getOrderId() {
        return orderId;
    }

    
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    
    public Integer getFoodId() {
        return foodId;
    }

    
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
}