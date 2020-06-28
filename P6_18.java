//import java.util.Random;
import java.util.Scanner;

 
public class P6_18 {
 
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        int[][] a=new int[4][3];
        int[][] b=new int[3][4];       
        System.out.println("a??");
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.print("a["+i+"]["+j+"]?:");
                a[i][j]=stdIn.nextInt();
            }
        }
        System.out.println("b??");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print("b["+i+"]["+j+"]?:");
                b[i][j]=stdIn.nextInt();
            }
        }
        int[][] c=new int[4][4];
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                for(int z=0; z<3; z++){
              
                    c[i][j]+=a[i][z]*b[z][j];
                }
            }
        }
        for(int[] cc:c){
            for(int ccc:cc){
                System.out.print(ccc+" ");
            }
            System.out.println();
        }
        stdIn.close();
    }}