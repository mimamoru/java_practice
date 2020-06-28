//import java.util.Random;
//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

 
public class R7_1 {
    static int[] naxIndexOf(int[] a) { 
        int max=Arrays.stream(a).max().getAsInt();
       var an=new ArrayList<Integer>();
       for(int i=0; i<a.length ;i++){
           if(a[i]==max) {
               an.add(i);
           }
       }
       int[] ans=new int[an.size()];
       for(int i=0; i<ans.length;i++){
           ans[i]=an.get(i);
       }
return ans;
     }
     static int[][] array2DOf(int[] a) { 
        int ans[][]=new int[a.length][];      
       for(int i=0; i<a.length ;i++){
      ans[i]=new int[a[i]];
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
        
        int[] ans=naxIndexOf(a);
        System.out.println("??????????");
        for(int i:ans){
            System.out.println(i);          // System.out.println("a["+i+"]="+a[i]);
       }
       int[][] ans2=array2DOf(a);
        System.out.println("??????????");
        for(int[] ii:ans2){
            for(int i:ii){
                System.out.print(i);          // System.out.println("a["+i+"]="+a[i]);
           } 
           System.out.println();                 // System.out.println("a["+i+"]="+a[i]);
       }

       
        stdIn.close();
    }
  

}