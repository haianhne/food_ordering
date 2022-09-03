package com.n37.foodordering.model;

import java.util.Date;

public class Food_order {
   
    private Integer id;

   
    private Long amount;

   
    private Date createdDate;

    private String payment;

   
    private Integer customerId;

   
    private Integer redtaurantId;

   
    private Boolean isDelete;

    
    public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

   
    public Date getCreatedDate() {
        return createdDate;
    }

   
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

   
    public String getPayment() {
        return payment;
    }

    
    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getCustomerId() {
        return customerId;
    }

   
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

   
    public Integer getRedtaurantId() {
        return redtaurantId;
    }

    
    public void setRedtaurantId(Integer redtaurantId) {
        this.redtaurantId = redtaurantId;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

   
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}