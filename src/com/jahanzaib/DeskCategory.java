package com.jahanzaib;


public class DeskCategory extends Desk implements FurnitureInterference{
    public DeskCategory(double quantity) {
        super(quantity);
    }
//    @Override
//    public void printDetails() {
//        System.out.println("Quantity"+quantity);
//        System.out.println("Price per chair : " + price);
//        System.out.println("Total Price : "+calculatePrice());
//        System.out.println("SAle Tax : "+ saleTax());
//    }

    public void wood(){
        System.out.println("Desk is of wood type");
        this.price= 100;
    }
    public void iron(){
        System.out.println("Desk is of Iron type");
        this.price= 200;
    }
    public void plastic(){
        System.out.println("Desk is of Plastic type");
        this.price= 300;
    }
}
