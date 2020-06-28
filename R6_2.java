import java.util.Random;
import java.util.Scanner;

 
public class R6_2 {
 
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        Random rnd=new Random();
        String[] tuki={"1","2","3","4","5","6","7","8","9","10","11","12"};
        String[] tuki2={"Jan","Feb","Mar","Aip","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int[] num={1,2,3,4,5,6,7,8,9,10,11,0};
        int count=0;
        for(int i=0; i<12; i++){
           int rn=rnd.nextInt(12);
           int rn2=rnd.nextInt(12);
           if(rn!=rn2){
               int t=num[rn];
               num[rn]=num[rn2];
               num[rn2]=t;
           }
        }
        for(int i:num){
            System.out.print(tuki[i]+"?:");
            if(tuki2[i].equals(stdIn.next())){
                System.out.println("right!!");
                count++;
         }else{System.out.println("no!!"+tuki2[i]);}
        
        }
       
                    System.out.println("finish!!==>>>>"+count);
                    stdIn.close();
                }
               
            }
       
    