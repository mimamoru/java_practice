//import java.util.Random;
//import java.util.LinkedList;
import java.util.Scanner;

// 1,3,4,7,9,11
public class P7_19 {
    static void aryRmvN(int[] a,int idx,int n) { 
       for(int i=idx; i<idx+n ;i++){
           if(i+n>=a.length){
               break;
           }
            a[i]=a[i+n];
       }
//        for(int i=0; i<a.length ;i++){
//         System.out.println("a["+i+"]="+a[i]);
//    }
//         System.out.println();
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
        System.out.print("n??");
        int n=stdIn.nextInt();
        aryRmvN(a,pos,n);
      //  System.out.println("??????????");
        for(int i=0; i<a.length ;i++){
            System.out.println("a["+i+"]="+a[i]);
       }
        stdIn.close();
    }
  

}