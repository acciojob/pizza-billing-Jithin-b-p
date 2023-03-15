package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean paperBagAdded;
    private boolean extraCheeseAdded;
    private boolean extraToppingAdded;
    private boolean billGiven;

    private String cheese = "";
    private String topping = "";
    private String paperbag = "";

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = 0;
        this.paperBagAdded = false;
        this.extraCheeseAdded = false;
        this.extraToppingAdded = false;
        this.billGiven = false;
        // your code goes here
        if(this.isVeg){
            this.price += 300;
            this.bill = "Base Price Of The Pizza: "+ 300 + "\n";
        }else{
            this.price += 400;
            this.bill = "Base Price Of The Pizza: "+ 400 + "\n";
        }



    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheeseAdded){
            return;
        }
        this.price += 80;
        this.cheese = "Extra Cheese Added: " + 80 + "\n";
        extraCheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppingAdded){
            return;
        }
        if(this.isVeg){
            this.price += 70;
            this.topping = "Extra Toppings Added: " + 70 + "\n";
        }else{
            this.price += 120;
            this.topping = "Extra Toppings Added: " + 120 + "\n";
        }
        extraToppingAdded = true;

    }

    public void addTakeaway(){
        // your code goes here
        if(paperBagAdded){
            return;
        }
        this.price += 20;
        this.paperbag = "Paperbag Added: " + 20 + "\n";
        paperBagAdded = true;
    }

    public String getBill(){
        // your code goes here
        if(this.billGiven){
            return "";
        }
        this.bill += this.cheese + this.topping + this.paperbag;
        this.bill += "Total Price: " + this.price + "\n";
        this.billGiven = true;
        return this.bill;

    }
}
