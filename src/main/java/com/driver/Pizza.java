package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean paperBagAdded;
    private boolean extraCheeseAdded;
    private boolean extraToppingAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.paperBagAdded = false;
        this.extraCheeseAdded = false;
        this.extraToppingAdded = false;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
            this.bill = "Base Price Of The Pizza:"+ 300 + "\n";
        }else{
            this.price = 400;
            this.bill = "Base Price Of The Pizza:"+ 400 + "\n";
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
        this.bill += "Extra Cheese Added:" + 80 + "\n";
        extraCheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppingAdded){
            return;
        }
        if(this.isVeg){
            this.price += 70;
            this.bill += "Extra Toppings Added:" + 70 + "\n";
        }else{
            this.price += 120;
            this.bill += "Extra Toppings Added:" + 120 + "\n";
        }
        extraToppingAdded = true;

    }

    public void addTakeaway(){
        // your code goes here
        if(paperBagAdded){
            return;
        }
        this.price += 20;
        this.bill += "Paperbag Added:" + 20 + "\n";
        paperBagAdded = true;
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price:" + this.price + "\n";
        return this.bill;

    }
}
