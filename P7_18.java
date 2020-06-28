//import java.util.Random;
//import java.util.LinkedList;
import java.util.Scanner;

 
public class P7_18 {
    static void aryRmv(int[] a,int idx) { 
       for(int i=idx; i<a.length-1 ;i++){
            a[i]=a[i+1];
       }
       for(int i=0; i<a.length ;i++){
        System.out.println("a["+i+"]="+a[i]);
   }
        System.out.println();
     }

   
       public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.print("x??");
        int x=stdIn.nextInt();
        int[] a=new int[x];
        for(int i=0; i<x ;i++){
            System.out.print("a["+i+"]=");
            int aa=stdIn.nextInt();
            a[i]=aa;
       }
        System.out.print("pos??");
        int pos=stdIn.nextInt();
        aryRmv(a,pos);
        System.out.println("??????????");
        for(int i=0; i<a.length ;i++){
            System.out.println("a["+i+"]="+a[i]);
       }
        stdIn.close();
    }
  

}