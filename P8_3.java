
public class P8_3 {
    private String name;
    private String number;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double tank;
    private double fuel;
    private double spec;

    public P8_3( String name,String number,int width,int height,int length,
     double tank,double fuel,double spec){
        this.name=name;
        this.number=number;
        this.width=width;
        this.height=height;
        this.length=length;
        this.x=0.0;
        this.y=0.0;
        this.tank=tank;
        this.fuel=fuel>tank?tank:fuel;
        this.spec=spec;

    }

    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    double getFuel(){
        return this.fuel;
    }
    void spec(){
        System.out.println(name);
        System.out.println(number);
        System.out.println(width);
        System.out.println(height);
        System.out.println(length);
        System.out.println(tank);
        System.out.println(spec);
    }
    boolean move(double x,double y){
        double dist=Math.sqrt(x*x+y*y);
        double f=dist/spec;
        if(f>fuel){return false;
        }else{
            fuel-=f;
            this.x+=x;
            this.y+=y;
            return true;
        }
    }

    void oil(double fuel){
        if(this.fuel+fuel<this.tank){
        this.fuel+=fuel;
        }else{
        this.fuel=tank; 
        }
    }




    public static void main(String[] args) {
    //     Car( String name,String number,int width,int height,int length,
    //  double tank,double fuel,double spec){
        P8_3 c1=new P8_3("ビッツ","99-99",1660,1500,3640,40.0,40.0,12.0);
        c1.spec();
         
    }
}