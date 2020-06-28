
//import java.util.Random;
import java.util.Scanner;
public class Sample10 {
 public static void main(String[] args) {
 //Random rnd=new Random();
Scanner stdIn=new Scanner(System.in);
System.out.print("x:"); int x=stdIn.nextInt();
System.out.print("y:"); int y=stdIn.nextInt();
 System.out.println(Math.max(x, y));
 stdIn.close();
 }}