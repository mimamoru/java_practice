public class P12_1 extends P8_3{

    private double distabce;
    private P9_4 purchasedeDay;

    P12_1( String name,String number,int width,int height,int length,
     double tank,double fuel,double spec,P9_4 purchasedeDay){
      super(name, number, width, height, length, tank, fuel, spec);
      this.distabce=0.0;
      this.purchasedeDay=new P9_4(purchasedeDay);
    }
    P12_1( String name,String number,int width,int height,int length,
    double tank,double fuel,double spec){
     this(name, number, width, height, length, tank, fuel, spec,new P9_4());
   }


    double getDistabce(){
        return this.distabce;
    }
    P9_4 getPurchasedeDay(){
        return new P9_4(this.purchasedeDay);
    }

    void spec(){
        super.spec();
        System.out.println(distabce);
        System.out.println(purchasedeDay);
        System.out.println("----------------------");
    }
    boolean move(double x,double y){
    	System.out.println(this.getPurchasedeDay());
        if(super.move(x, y)){
        	
            this.distabce+=Math.sqrt(x*x+y*y);
            return true;
        }else{
            return false;
        }

    }





    public static void main(String[] args) {
    //     Car( String name,String number,int width,int height,int length,
    //  double tank,double fuel,double spec){
        P12_1 c1=new P12_1("ビッツ","99-99",1660,1500,3640,40.0,40.0,12.0);
        c1.spec();
        c1.move(4, 5);
        c1.spec();
        P12_1 c2=new P12_1("ビッツ2","99-992",1660,1500,3640,40.0,40.0,12.0,new P9_4(2017, 4, 25));
        c2.spec();
        c2.move(4, 10);
        c2.spec();

        System.out.println("x:"+c2.getX()+"y:"+c2.getY());
        System.out.println("fuel:"+c2.getFuel());
        System.out.println("prchasedeDay:"+c2.getPurchasedeDay());

        P8_3 c3=new P12_1("ビッツ2","99-992",1660,1500,3640,40.0,40.0,12.0);
        c2.move(4, 10);
        c3.spec();
        System.out.println("prchasedeDay:"+((P12_1)c3).getPurchasedeDay());

    }

}