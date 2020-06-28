import java.util.Random;
import java.util.Scanner;

 
public class P6_16 {
 
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        Random rnd=new Random();
        String[] yobi={"getu","ka","sui","moku","kin","do","nichi"};
        String[] yobi2={"s","m","t","w","th","f","sat"};
        int tr=1;
        int la=-1;
        int rn=-1;
        while(tr==1){
            while(rn==la){
            rn=rnd.nextInt(7);}
            la=rn;
            //System.out.print(yobi[rn]+"?:");
            while(true){
                System.out.print(yobi[rn]+"?:");
                if(yobi2[rn].equals(stdIn.next())){
                    System.out.println("right!!");
                    while(tr>1||tr<-1){
                    System.out.println("more?y/1,n/0");
                   tr=stdIn.nextInt();}
                   break;
                }else{
                    System.out.println("try again!!");
                }
            }
        }
        
        int x=stdIn.nextInt();
        int[] arr=new int[x];
        arr[0]=rnd.nextInt(9)+1;
        for(int i=1; i<x; i++){
            
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