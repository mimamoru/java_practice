package vendingmachine;

public class FoodMachine implements VendingMachine{
    private Product product;
    private int money;

    public FoodMachine(Product product,int money){
        this.product=product;
        this.money=money;
    }

    @Override
    public int Change(){
        this.money-=product.getPrice();
        return this.money;
    }

    @Override
    public int processing(){
        int change=Change();
        System.out.println("ご購入ありがとうございます。");
        int time=product.getTime();
        System.out.println("商品を作っています。しばらくお待ち下さい。");
        while(time-->0){
        try {
            Thread.sleep(1000); 
           } catch (InterruptedException e) {
           }
        System.out.println("残り"+time+"秒");
        }
        System.out.println(product.getName()+"が完成しました。残金は"+change+"円です。");
        return change;
    }

    @Override
    public void Bye(){
        System.out.println("また来てください。お釣りは"+this.money+"円です。");
    }
}
