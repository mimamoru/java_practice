package company;

import java.util.ArrayList;

public class Child {
    private int id;
    private String name;
    private int parent_id;
    private int ten_sales;
   // private ArrayList<Product> products;

    Child(int id,String name,int parent_id,int ten_sales){
        this.id=id;
        this.name=name;
        this.parent_id=parent_id;
        this.ten_sales=ten_sales;
    }

    private ArrayList<Product> getProducts(){
        
        return new Info().Select3(this.id);
    }

    static void print(ArrayList<Child> childlen){
//         店舗名　|月間合計売上(円)|取扱商品種類｜種類別在庫量(個)
// ================================================
// ○○店　|　　 123,456,789|食料　　　　|　　　50,000
// 　　　　　　　　　　　　　飲料　　　　|　　　60,000
// --------------------------------------------------------------------------------------
// ○○店　|…
    System.out.printf("%-9s|%-12s|%-9s|%-9s","店舗名　","月間合計売上(円)","取扱商品種類","種類別在庫量(個)");
    System.out.println("============================================");

    for(Child c:childlen){
        boolean flg=true;
        for(Product p:c.getProducts()){
        if(flg){
        System.out.printf("%-9s|%,12d|%-9s|%,9d",c.name,c.ten_sales,p.getName(),p.getPro_inv());
        }else{
        System.out.printf("%-9s|%-12s|%-9s|%,9d","","",p.getName(),p.getPro_inv());
        }
        flg=false;
    }
    
        System.out.println("--------------------------------------------");

        //this.getProducts();
        //System.out.println(this.name);
    }
    }
}