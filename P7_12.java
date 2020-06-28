//import java.util.Random;
//import java.util.LinkedList;
import java.util.Scanner;

 
public class P7_12 {
    static String rRotate(int x,int n) {   
        int n2=-n;
        String a="";
        String s=Integer.toBinaryString(x);    
        int l=s.length();
        System.out.println(s);
        int l2=s.length();
        while(l-->0){
            
            if(n2<0){n2+=l2;}
            if(n2>=l2){n2-=l2;}
            //System.out.println(n2+"/"+l+"/"+s.substring(n2,n2+1));
             a=a.concat(s.substring(n2,n2+1));
             //System.out.println(a+"/"+a.length());
             n2++;
        }
       //return Integer.parseInt(a);
       return a;
    }
    static String lRotate(int x,int n) {
        String a="";
        String s=Integer.toBinaryString(x);    
        int l=s.length();
        int l2=l;
        while(l-->0){
            if(n>=l2){n-=l2;}
             a=a.concat(s.substring(n,n+1));
             n++;
        }
       return a;
    }
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.print("x??");
        int x=stdIn.nextInt();
        System.out.print("n??");
        int n=stdIn.nextInt();
        System.out.print("R/L??");
        System.out.println(stdIn.next().equals("R")?rRotate(x, n):lRotate(x,n));
        System.out.println(stdIn.next().equals("R")?rRotate(x, n):lRotate(x,n));
        stdIn.close();
    }
  

}