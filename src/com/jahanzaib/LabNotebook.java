package com.jahanzaib;

public class LabNotebook extends Notebook implements NotebookInterference{


    public LabNotebook(double quantity) {
        super(quantity);
    }

    @Override
    public void printDetails() {

            System.out.println("No of Lab Notebooks : "+quantity);
            System.out.println("Price per Notebook : " + price);
            System.out.println("Total Price : "+totalPrice());

    }
public static final double LABPRICE = 100;
    public void setLabprice(){
        this.price= LABPRICE;
    }


    @Override
    public double totalPrice() {
        return getPrice()*quantity;
    }

}
