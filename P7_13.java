//import java.util.Random;
//import java.util.LinkedList;
import java.util.Scanner;

 
public class P7_13 {
    static void print(int x) { 
        int i=32;  
        while(--i>=0){
        System.out.print(x>>>i&1);
        }
        System.out.println();
     }

    static int set(int x,int pos) {          
       return x|(1<<pos);
    }
    static int reset(int x,int pos) {         
        return x&~(1<<pos);
     }
     static int inverse(int x,int pos) {    
        return x^(1<<pos);
     }
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.print("x??");
        int x=stdIn.nextInt();
        System.out.print("pos??");
        int pos=stdIn.nextInt();
        System.out.printf("%-8s","before");
        print(x);
        System.out.printf("%-8s","set");
        print(set(x, pos));
        System.out.printf("%-8s","reset");
        print(reset(x, pos));
        System.out.printf("%-8s","inverse");
        print(inverse(x, pos));
        stdIn.close();
    }
  

}