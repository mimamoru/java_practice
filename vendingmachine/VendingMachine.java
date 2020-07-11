package vendingmachine;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface VendingMachine {
   
   static void greet(ArrayList<Product> products){
    Scanner stdIn=new Scanner(System.in);
    System.out.println("いらっしゃいませ");
    
    System.out.println("商品一覧");
    Map<Boolean, List<Product>> group =products.stream().collect(Collectors.partitioningBy(e->e.getTime()<0));
    int min=products.stream().min((e1,e2)->e1.getPrice()-e2.getPrice()).get().getPrice();
    int money=products.stream().max((e1,e2)->e1.getPrice()-e2.getPrice()).get().getPrice();
    
    Print(group,money);
    //products.stream().sorted((e1,e2)->e1.getTime()-e2.getTime()).forEach(s->System.out.println((s.getTime()<0?"飲み物:":"食べ物:")+s.getName()+"  "+s.getPrice()+"円"));
  
    System.out.println("お金を入れてください");      
    int[] moneys=new int[5];
    System.out.print("1000円札の枚数=>");moneys[0]=stdIn.nextInt();
    System.out.print("500円玉の枚数=>");moneys[1]=stdIn.nextInt();
    System.out.print("100円玉の枚数=>");moneys[2]=stdIn.nextInt();
    System.out.print("50円玉の枚数=>");moneys[3]=stdIn.nextInt();
    System.out.print("10円玉の枚数=>");moneys[4]=stdIn.nextInt();

    money=Calc(moneys);

    System.out.println(money+"円入金されました。");  

    int flg=0;
    VendingMachine vend=null;

    do{
        System.out.println("商品番号を選んでください");
        Print(group,money);   
        int idx=stdIn.nextInt();
        Product pro=products.get(idx-1);
        
        if(money>=pro.getPrice()){
            vend=getVending(pro,money);
            money=vend.processing();
        }
        System.out.print("続けて購入しますか？=> yes:0/no:1");
        flg=stdIn.nextInt();
        if(money<min){
            System.out.print("残額不足です");     
            flg=1;
        }
    }while(flg==0);
        if(vend!=null){
            vend.Bye();
}
   };

   private static VendingMachine getVending(Product p,int money){
    if(p.getTime()==0){
        return new DrinkMachine(p,money);
    }
      return  new FoodMachine(p,money);
   }

   private static void Print(Map<Boolean, List<Product>> group,int money){        
    System.out.println("飲み物");
    for (Product pp : group.get(true)) {
        if(money>=pp.getPrice()){
            System.out.println(pp.getId()+"."+pp.getName()+":"+pp.getPrice()+"円");
        }
    }
    System.out.println("食べ物");
    for (Product pp : group.get(false)) {
        if(money>=pp.getPrice()){
        System.out.println(pp.getId()+"."+pp.getName()+":"+pp.getPrice()+"円");
         }
    }
   };
   
   static int Calc(int[] moneys){ 
    return  moneys[0]*1000+ moneys[1]*500+ moneys[2]*100+ moneys[3]*50+ moneys[4]*10;
   };

   int Change();

   int processing();

   void Bye();
}