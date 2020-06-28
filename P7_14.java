//import java.util.Random;
//import java.util.LinkedList;
import java.util.Scanner;

 
public class P7_14 {
    static void print(int x) { 
        int i=32;  
        while(--i>=0){
        System.out.print(x>>>i&1);
        }
        System.out.println();
     }

    static int set(int x,int pos,int s) {  
        int a=0b1;
        for(int j=1; j<s; j++){
            if(pos+j>31){
                break;
            }
            a=a<<1|1;
        }  
      // print(a<<pos);      
       return x|(a<<pos);
    }
    static int reset(int x,int pos,int s) { 
        int a=0b1;
        for(int j=1; j<s; j++){
            if(pos+j>31){
                break;
            }
            a=a<<1|1;
        }      
        return x&~(a<<pos);
     }
     static int inverse(int x,int pos,int s) { 
        int a=0b1;
        for(int j=1; j<s; j++){
            if(pos+j>31){
                break;
            }
            a=a<<1|1;
        }  
        return x^(a<<pos);
     }
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.print("x??");
        int x=stdIn.nextInt();
        System.out.print("pos??");
        int pos=stdIn.nextInt();
        System.out.print("s??");
        int s=stdIn.nextInt();
        System.out.printf("%-8s","before");
        print(x);
        System.out.printf("%-8s","set");
        print(set(x, pos,s));
        System.out.printf("%-8s","reset");
        print(reset(x, pos,s));
        System.out.printf("%-8s","inverse");
        print(inverse(x, pos,s));
        stdIn.close();
    }
  

}