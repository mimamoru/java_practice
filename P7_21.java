//import java.util.Random;
//import java.util.LinkedList;
import java.util.Scanner;

 //1,2,3,4,5
public class P7_21 {

    static void aryCh2(int[] c,int cp[]) { 
   
       int i=-1; 
           while(++i<Math.min(cp.length,c.length)){
            c[i]=cp[i];
        
        }
       
    }
    static void aryCh(int[] a,int b[]) { 
        int[] a_cp=new int[a.length];
        int[] b_cp=new int[b.length];
        for(int i=0; i<a.length ;i++){
            a_cp[i]=a[i];
            }
        for(int i=0; i<b.length ;i++){
            b_cp[i]=b[i];
            }
        aryCh2(a,b_cp);
        aryCh2(b,a_cp);    
   }
       

   
       public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.print("a_x??");
        int ax=stdIn.nextInt();
        int[] a=new int[ax];
        for(int i=0; i<ax ;i++){
            System.out.print("a["+i+"]=");
            int aa=stdIn.nextInt();
            a[i]=aa;
       }
       System.out.print("b_x??");
       int bx=stdIn.nextInt();
       int[] b=new int[bx];
       for(int i=0; i<bx ;i++){
           System.out.print("b["+i+"]=");
           int bb=stdIn.nextInt();
           b[i]=bb;
      }
        // System.out.print("pos??");
        // int pos=stdIn.nextInt();
        // System.out.print("x??");
        // int x2=stdIn.nextInt();
        aryCh(a,b);
        System.out.println("aaaaaa");
        for(int i=0; i<a.length ;i++){
            System.out.println("a["+i+"]="+a[i]);
       }
       System.out.println("bbbbbb");
        for(int i=0; i<b.length ;i++){
            System.out.println("b["+i+"]="+b[i]);
       }
        stdIn.close();
    }
  

}