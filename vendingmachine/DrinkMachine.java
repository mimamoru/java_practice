package vendingmachine;

public class DrinkMachine implements VendingMachine{
    private Product product;
    private int money;

    public DrinkMachine(Product product,int money){
        this.product=product;
        this.money=money;
    }

    @Override
    public int Change(){
        return this.money-product.getPrice();
    }

    @Override
    public int processing(){
        int change=Change();
        System.out.println("ご購入ありがとうございます。");
        System.out.println(product.getName()+"です。残額は"+change+"円です。");
        return change;
    }

    @Override
    public void Bye(){
        System.out.println("また来てください。お釣りは"+money+"円です。");
    }
}