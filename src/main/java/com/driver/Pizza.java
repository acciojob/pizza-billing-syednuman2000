package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private boolean Cheese=false;
    private boolean Toppings=false;
    private boolean Bag=false;
    private boolean billGenerated=false;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) price+=300;
        else price+=400;
        bill="";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!Cheese){
            price+=80;
            Cheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!Toppings){
            if(isVeg) price+=70;
            else price+=120;
            Toppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!Bag){
            price+=20;
            Bag=true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!billGenerated) {
            if (isVeg) bill += "Base Price Of The Pizza: 300\n";
            else bill += "Base Price Of The Pizza: 400\n";

            if (Cheese) bill += "Extra Cheese Added: 80\n";

            if (Toppings) {
                if (isVeg) bill += "Extra Toppings Added: 70\n";
                else bill += "Extra Toppings Added: 120\n";
            }

            if (Bag) bill += "Paperbag Added: 20\n";

            bill += "Total Price: " + price;
            bill += "\n";
            billGenerated = true;
        }

        return this.bill;
    }
}
