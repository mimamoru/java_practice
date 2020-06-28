//import java.util.Random;
//import java.util.LinkedList;
import java.util.Scanner;

 
public class R7_3 {

   void func() {  
    Scanner stdIn=new Scanner(System.in);     
    System.out.print("r");
    int r=stdIn.nextInt();
    int[][] x=new int[r][];
    int max=0;
    for(int i=0; i<r ;i++){
        System.out.print("col_"+i+"=");
        int col=stdIn.nextInt();
        x[i]=new int[col];
        if(col>max){
            max=col;
        }
   }
   int[][] arr=new int[r][max];
   for(int i=0; i<r; i++){
    for(int j=0; j<max; j++){
        if(x[i].length>j){
        System.out.printf("a2[%d][%d]=",i,j);
        arr[i][j]=stdIn.nextInt();
    }else{ arr[i][j]=100;}
        }  
    }  
    for(int[] i:arr){
        for(int j:i){     
           // System.out.printf(j==100? "%-3s","-":"%3d",j);
            if(j==100){
            System.out.printf("%-3s","-");
            }else{System.out.printf("%3d",j);}
        }  
        System.out.println();
   }
   stdIn.close();
}

   
       public static void main(String[] args) {
        R7_3 n=new R7_3();
        n.func();     
    }
}

