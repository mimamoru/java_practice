//import java.util.Random;
import java.util.Scanner;

 
public class P7_7 {
    static void write(String c,int t) {
        for(int i=0; i<t; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.print("nanndann??");
        write("*", stdIn.nextInt());
      
        stdIn.close();
    }
  

}