package com.jahanzaib;

public abstract class Furniture implements FurnitureInterference {
   double quantity;
   double price;
//Constructor

    public Furniture(double quantity) {
        this.quantity = quantity;
    }

//    public abstract void printDetails();
    public abstract double saleTax();
    public abstract double priceWithoutTax();
    public abstract double calculatePrice();
    
    public double getQuantity() {
        return quantity;
    }
    

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
