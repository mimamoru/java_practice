import java.util.Random;
import java.util.Scanner;

 
public class Sample1_1 {
 
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        Random rnd=new Random();
        System.out.print("x:");
        int x=stdIn.nextInt();
        int[] arr=new int[x];
        arr[0]=rnd.nextInt(9)+1;
        for(int i=1; i<x; i++){
            //tSystem.out.println("i:"+i);
            outer:
            while(true)
        {arr[i]=rnd.nextInt(9)+1;
            //System.out.print("arr[i]:"+arr[i]+"/");
            for(int j=0; j<i; j++){
               // System.out.println("arr[i]:"+arr[i]+"/"+arr[j]);
               // System.out.println("i:"+i+"/"+j);
                if(arr[i]==arr[j]){
                    break;
                }else if(j==i-1){
                    break outer;
                }
            }
          
        }  
    }
       stdIn.close();
        for(int k:arr){
            System.out.println(k);
        }
        
       
    }
 
}