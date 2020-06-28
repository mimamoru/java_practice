import java.util.Random;
import java.util.Scanner;

 
public class P7_10 {
    static Random rnd=new Random();
    static int write(int x,int y,int z) {
       
        
        switch(rnd.nextInt(4)){
            case 0: System.out.print(x+"+"+y+"-"+z+"=");
                    return x+y-z;
            case 1: System.out.print(x+"+"+y+"+"+z+"=");
                    return x+y+z;
            case 2: System.out.print(x+"-"+y+"-"+z+"=");
                    return x-y-z;
            case 3: System.out.print(x+"-"+y+"+"+z+"=");
                    return x-y+z;
            default: System.out.print(x+"-"+y+"+"+z+"=");
                    return x-y+z; }     
    }
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
    
        int ans=write(rnd.nextInt(900)+100,rnd.nextInt(900)+100,rnd.nextInt(900)+100);
        System.out.print(stdIn.nextInt()==ans?"ok":"ng"+ans);
        stdIn.close();
    }
  

}