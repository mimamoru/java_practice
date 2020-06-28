import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
 
public class R6_1 {
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        Random rnd=new Random();
        System.out.print("num: ");
        int l=  stdIn.nextInt(); 
        int[] r=new int[l];
        for(int j=0; j<l; j++){
            r[j]=rnd.nextInt(10);
        }       
       
        int max=Arrays.stream(r).max().getAsInt();
        String[][] a=new String[max][l];
        
        for(int i=0; i<max; i++){
           // System.out.print(i+1+" ");
            for(int j=0; j<l; j++){           
                a[i][j]=r[j]>i?"* ":"  ";
            }
        }
        for(int j=0; j<l; j++){
            System.out.print(j%10+"  ");
        }
        System.out.println();
        for(String[] cc:a){
            for(String ccc:cc){
                System.out.print(ccc+" ");
    
            }
            System.out.println();
        }
        for(int ccc:r){
            System.out.print(ccc+" ");
        }
        stdIn.close();
    }
  

}