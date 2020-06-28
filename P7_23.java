//import java.util.Random;
//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

 
public class P7_23 {
    static int[] arySrch(int[] a,int x) { 
       var an=new ArrayList<Integer>();
       for(int i=0; i<a.length ;i++){
           if(a[i]==x) {
               an.add(i);
           }
       }
       int[] ans=new int[an.size()];
       for(int i=0; i<ans.length;i++){
           ans[i]=an.get(i);
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
        int[] ans=arySrch(a,pos);
        System.out.println("??????????");
        for(int i:ans){
            System.out.println(i);
            // System.out.println("a["+i+"]="+a[i]);
       }
        stdIn.close();
    }
  

}