package com.jahanzaib;

public class Chair extends Furniture implements FurnitureInterference{

    public Chair(double quantity) {
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
    	System.out.println("No of Chairs : "+quantity);
        System.out.println("Price per chair : " + price);
        System.out.println("Total Price without tax : "+priceWithoutTax());
        System.out.println("Sale Tax (17%) : "+ saleTax());
        System.out.println("Total Price including Tax : "+ calculatePrice());
    }
}
