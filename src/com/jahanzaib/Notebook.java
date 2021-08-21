package com.jahanzaib;

public abstract class Notebook implements NotebookInterference{
    double quantity;
   public double price;

    public Notebook(double quantity) {
        this.quantity = quantity;
    }

    public abstract double  totalPrice();
    public abstract void printDetails();

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
