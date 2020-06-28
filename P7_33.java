//import java.util.Random;
//import java.util.LinkedList;
import java.util.Scanner;

 //1,2,3,4,5
public class P7_33 {

    static void printArray(int[] a) {       
        for(int i:a){
            System.out.printf("%6d",i);
            }    
            System.out.println();
   }
    static void printArray(int[][] a) { 
        for(int[] aa:a){
            printArray(aa);
            //System.out.println();
            }  
   }
       

   
       public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.print("1_x??");
        int ax=stdIn.nextInt();
        int[] a=new int[ax];
        for(int i=0; i<ax ;i++){
            System.out.print("a["+i+"]=");
            int aa=stdIn.nextInt();
            a[i]=aa;
       }

        System.out.print("2_y??");
        //int a2y=stdIn.nextInt();
        int a2[][]=new int[stdIn.nextInt()][];
        for(int i=0; i<a2.length ;i++){
            System.out.print("2_x??");
           // int a2x=stdIn.nextInt();
            a2[i]=new int[stdIn.nextInt()];
       }
       for(int i=0; i<a2.length; i++){
        for(int j=0; j<a2[i].length; j++){
            System.out.printf("a2[%d][%d]=",i,j);
           a2[i][j]=stdIn.nextInt();
            }  
        }  
        printArray(a);
        printArray(a2);

        stdIn.close();
       }
       
    }
  

