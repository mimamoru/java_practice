//import java.util.Random;
//import java.util.LinkedList;
import java.util.Scanner;

 //1,2,3,4,5
public class P7_20 {
    static void aryIns(int[] a,int idx,int x) { 
        if(idx<0||idx>=a.length){return;}
       for(int i=a.length-1; i>idx ;i--){
            a[i]=a[i-1];
       }
       a[idx]=x;
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
        System.out.print("x??");
        int x2=stdIn.nextInt();
        aryIns(a,pos,x2);
        System.out.println("??????????");
        for(int i=0; i<a.length ;i++){
            System.out.println("a["+i+"]="+a[i]);
       }
        stdIn.close();
    }
  

}