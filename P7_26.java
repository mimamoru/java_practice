//import java.util.Random;
//import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.Scanner;

 
public class P7_26 {
    static int[] aryInsOf(int[] a,int idx,int x) { 
       
       int[] ans=new int[a.length+1];
       for(int i=0,j=0; i<a.length;i++){
        if(i==idx){
           ans[j++]=x;
        }
        ans[j++]=a[i];
       }
    return ans;
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
        int[] ans=aryInsOf(a,pos,n);
        System.out.println("??????????");
        for(int i:ans){
            System.out.println(i);
            // System.out.println("a["+i+"]="+a[i]);
       }
        stdIn.close();
    }
  

}