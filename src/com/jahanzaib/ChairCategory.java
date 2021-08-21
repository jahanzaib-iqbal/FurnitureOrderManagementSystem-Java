package com.jahanzaib;

public class ChairCategory extends Chair implements FurnitureInterference{
    public ChairCategory(double quantity) {
        super(quantity);
    }

    public void wood(){
        System.out.println("Chair is of wood type");
        this.price= 100;
    }
    public void iron(){
        System.out.println("Chair is of Iron type");
        this.price= 200;
    }


}
