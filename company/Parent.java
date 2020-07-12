package company;

import java.util.ArrayList;

public class Parent {
    private int id;
    private String name;
    private int com_sales;
    private int count;

    Parent(int id,String name,int com_sales,int count){
        this.id=id;
        this.name=name;
        this.com_sales=com_sales;
        this.count=count;
    }

    private ArrayList<String> getChildren(){
        return new Info().Select4(this.id);
    }
  

    static void print(ArrayList<Parent> parents){
        // 会社名　|店舗数|月間合計売上(円)|
        // ============================
        // Teven 　|　　10|　　123,456,789|
        // --------------------------------------------------
        // Gamima|…
        System.out.printf("%-9s|%-5s|%-12s","会社名","店舗数","月間合計売上(円)");
        System.out.println("============================================");
        for(Parent p:parents){
            System.out.printf("%-9s|%,5d|%,12d",p.name,p.count,p.com_sales);
            System.out.println("--------------------------------------------");
             // p.getChildren();
        }     
    }

}