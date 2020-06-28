//import java.util.Random;
import java.util.Scanner;

 
public class P6_19 {
 
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        int[][] a=new int[6][3];
        double[] b=new double[6];
        double[] c=new double[2];
        
        
        for(int i=0; i<6; i++){
            System.out.print(i+1+"...");
            for(int j=1; j<3; j++){
                System.out.print(j==1?"japanese: ":"    math: ");
                a[i][j]=stdIn.nextInt();
    
            }
        }
        for(int j=0; j<6; j++){
            b[j]=(a[j][1]+a[j][2])/2;
            a[j][0]=j+1;
        }
        for(int j=1; j<3; j++){
            c[j-1]=(a[0][j]+a[1][j]+a[2][j]+a[3][j]+a[4][j]+a[5][j])/5;
        }
        System.out.printf("%-4s%-4s%-4s%-4s%n","No.","koku","suu","ave");
        int k=0;
        for(int[] cc:a){
            for(int ccc:cc){
                System.out.printf("%4d",ccc);
    
            }
            System.out.printf("%4.1f%n",b[k]);
            k++;
         
        }
        System.out.printf("%-4s%4.1f%4.1f%n","ave",c[0],c[1]);
        stdIn.close();
    }
  

}