package company;

public class Product {
    private int id;
    private String name;
    private int child_id;
    private int pro_inv;

    Product(int id,String name,int child_id,int pro_inv){
        this.id=id;
        this.name=name;
        this.child_id=child_id;
        this.pro_inv=pro_inv;
    }
    public String getName(){
        return this.name;
    }
    public int getPro_inv(){
        return this.pro_inv;
    }
}