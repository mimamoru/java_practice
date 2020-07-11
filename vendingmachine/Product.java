package vendingmachine;

import jdk.jfr.DataAmount;


public class Product {
    private int id;
    private String name;
    private int price;
    private int time;

    public Product(int id,String name ,int price,int time){
        this.id=id;
        this.name=name;
        this.price=price;
        this.time=time;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getTime(){
        return this.time;
    }

    
}