package com.n37.foodordering.model;

public class Menu {
   
    private Integer id;

    
    private String name;

    
    private Integer restaurantId;

  
    private Integer foodId;

    
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

   
    public Integer getRestaurantId() {
        return restaurantId;
    }

    
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

   
    public Integer getFoodId() {
        return foodId;
    }

    
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
}