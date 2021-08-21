package com.jahanzaib;

public class Spiral extends Notebook implements NotebookInterference{

    public Spiral(double quantity) {
        super(quantity);
    }
    public static final double SPIRALPRICE = 200;

    @Override
    public void printDetails() {


            System.out.println("No of Spiarl Notebooks: "+quantity);
            System.out.println("Price per Notebook : " + price);
            System.out.println("Total Price : "+totalPrice());


    }

    public void setSpiralprice(){
        this.price= SPIRALPRICE;
    }


    @Override
    public double totalPrice() {
        return getPrice()*quantity;
    }

}
