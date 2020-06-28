class Human{
    private String name;
    private int height;
    private int weight;

    Human( String name,int height,int weight){
        this.name=name;
        this.weight=weight;
        this.height=height;
       
    }
    Human(){
        this.name="name";
        this.weight=0;
        this.height=0;
       }
    Human(Human c){
        this.name=c.name;
        this.weight=c.weight;
        this.height=c.height;       
    }

    String getName(){
        return this.name;
    }
    int getHeight(){
        return this.height;
    }
    int getWeight(){
        return this.weight;
    }
    @Override
    public String toString(){
        return this.getName()+" "+this.getHeight()+"cm　"+this.getWeight()+"kg";
    }
   
}


public class P8_2 {
    public static void main(String[] args) {
   
    //     Human h1=new Human("aa",156,50);
        
    //     System.out.println(h1.toString());
    }
}