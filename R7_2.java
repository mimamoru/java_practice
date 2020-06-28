//import java.util.Random;
//import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.Scanner;

 
public class R7_2 {
    static int[][] addMatrix(int[][] x,int[][] y) { 
       int r=Math.max(x.length,y.length);
      int[][] z=new int[r][];
       for(int i=0; i<r;i++){
        int c=i>x.length-1?y[i].length:i>y.length-1?x[i].length:Math.max(x[i].length,y[i].length);
        z[i]=new int[c];
        for(int j=0; j<c;j++){
            if(i>x.length-1||j>x[i].length-1){z[i][j]=y[i][j];
            } else if(i>y.length-1||j>y[i].length-1){z[i][j]=x[i][j];
            }else{z[i][j]=x[i][j]+y[i][j];
           }
        }}
    return z;
     }

   
       public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
    
        int[][] x={{1,2,3,4,5},{4,5,6}};
        int[][] y={{6,3,4},{5,1,2},{8,9,0,89}};
       
        int[][] z =addMatrix(x,y);
        System.out.println("??????????");
        for(int[] ii:z){
            for(int i:ii){
                System.out.print(i+"  ");              
           }
           System.out.println();
       }
       
     
        stdIn.close();
    }
  

}