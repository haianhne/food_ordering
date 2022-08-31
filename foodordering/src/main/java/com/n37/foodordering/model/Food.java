package com.n37.foodordering.model;

import java.util.Date;

public class Food {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.id
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.name
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.quantity
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.orderDetail_id
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private Integer orderdetailId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.image
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.sell_time
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private Date sellTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.unit_price
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private Long unitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.created_date
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private Date createdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.status
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.decription
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    private String decription;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.id
     *
     * @return the value of food.id
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.id
     *
     * @param id the value for food.id
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.name
     *
     * @return the value of food.name
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.name
     *
     * @param name the value for food.name
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.quantity
     *
     * @return the value of food.quantity
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.quantity
     *
     * @param quantity the value for food.quantity
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.orderDetail_id
     *
     * @return the value of food.orderDetail_id
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public Integer getOrderdetailId() {
        return orderdetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.orderDetail_id
     *
     * @param orderdetailId the value for food.orderDetail_id
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setOrderdetailId(Integer orderdetailId) {
        this.orderdetailId = orderdetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.image
     *
     * @return the value of food.image
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.image
     *
     * @param image the value for food.image
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.sell_time
     *
     * @return the value of food.sell_time
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public Date getSellTime() {
        return sellTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.sell_time
     *
     * @param sellTime the value for food.sell_time
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setSellTime(Date sellTime) {
        this.sellTime = sellTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.unit_price
     *
     * @return the value of food.unit_price
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public Long getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.unit_price
     *
     * @param unitPrice the value for food.unit_price
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.created_date
     *
     * @return the value of food.created_date
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.created_date
     *
     * @param createdDate the value for food.created_date
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.status
     *
     * @return the value of food.status
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.status
     *
     * @param status the value for food.status
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.decription
     *
     * @return the value of food.decription
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public String getDecription() {
        return decription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.decription
     *
     * @param decription the value for food.decription
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    public void setDecription(String decription) {
        this.decription = decription;
    }
}