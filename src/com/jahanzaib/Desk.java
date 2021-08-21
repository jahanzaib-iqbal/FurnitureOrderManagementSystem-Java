package com.jahanzaib;

public class Desk extends Furniture implements FurnitureInterference{
    public Desk(double quantity) {
        super(quantity);
    }

    @Override
    public double priceWithoutTax() {
    	return quantity*getPrice();
    }
    
    @Override
    public double saleTax() {
        return priceWithoutTax()*0.17;
    }
 
    
    @Override
    public double calculatePrice() {
        return (quantity*getPrice())+saleTax();
    }
    
//    @Override
    public void printDetails() {
    	System.out.println("Number of Desks : "+quantity);
        System.out.println("Price per Desk : " + this.price);
        System.out.println("Total Price without tax : "+ priceWithoutTax());
        System.out.println("Sale Tax (17%) : "+ saleTax());
        System.out.println("Total Price including Taxa : "+ calculatePrice());
    }




}
