//import java.util.Random;
//import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.Scanner;

 
public class P7_27 {
    static boolean addMatrix(int[][] x,int[][] y,int[][] z) { 
       if(z.length!=y.length||z.length!=x.length){return false;}
      
       for(int i=0; i<z.length;i++){
        if(z[i].length!=y[i].length||z[i].length!=x[i].length){return false;}
        for(int j=0; j<z[i].length;j++){
           z[i][j]=x[i][j]+y[i][j];
           }
       }
    return true;
     }

   
       public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
    
        int[][] x={{1,2,3},{4,5,6}};
        int[][] y={{6,3,4},{5,1,2}};
        int[][] z=new int[2][3];
        boolean b=addMatrix(x,y,z);
        System.out.println("??????????");
        for(int[] ii:x){
            for(int i:ii){
                System.out.print(i);              
           }
           System.out.println();
       }
       System.out.println("??????????");
       for(int[] ii:y){
        for(int i:ii){
            System.out.print(i);              
       }
       System.out.println();
   }
   System.out.println("??????????");
        if(b){
        for(int[] ii:z){
            for(int i:ii){
                System.out.print(i);              
           }
           System.out.println();
       }}else{ System.out.println("nooooo");}
        stdIn.close();
    }
  

}