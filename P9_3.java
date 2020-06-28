//use P8_2
import java.util.Scanner;
public class P9_3 {
    static void printHuman(Human[] h,int j) {
        System.out.printf("第%2d行%n",j+1);
        int jj=1;
        for(Human i:h){
            System.out.println("No."+(jj++)+" "+i.toString());
        }
    }
    static void printHuman(Human[][] h,int j) {
        for(Human[] i:h){
            printHuman(i,j++);
        }
    }
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
    

        Human[] pHumans={new Human("a",140,40),new Human("b",180,78)};
        Human[][] xHumans={{new Human("a",140,40),new Human("b",180,78)},{new Human("c",150,60),new Human("d",160,48)}};
        Human cpHuman=new Human(xHumans[0][1]);
        System.out.print("q_col?");
        int q=stdIn.nextInt();
        Human[] qHumans=new Human[q];
        for(int i=0; i<q; i++){     
        System.out.print("name?");
        String n=stdIn.next();
        System.out.print("height?");
        int h=stdIn.nextInt();
        System.out.print("weight?");
        int w=stdIn.nextInt();
        qHumans[i]=new Human(n,h,w);
        }

        System.out.print("y_row?");
        int yr=stdIn.nextInt();
        Human[][] yHumans=new Human[yr][];
        for(int i=0; i<yr; i++){   
            System.out.printf("y[%d]_col?",i);
            int yc=stdIn.nextInt();
            yHumans[i]=new Human[yc];
            for(int j=0; j<yc; j++){     
                System.out.print("name?");
                String n=stdIn.next();
                System.out.print("height?");
                int h=stdIn.nextInt();
                System.out.print("weight?");
                int w=stdIn.nextInt();
                yHumans[i][j]=new Human(n,h,w);
                }
            }
            System.out.println("---------------pHumans--------------");
            printHuman(pHumans,0);
            System.out.println("---------------pHumans--------------");
            printHuman(qHumans,0);
            System.out.println("---------------xHumans--------------");
            printHuman(xHumans,0);
            System.out.println("---------------yHumans--------------");
            printHuman(yHumans,0);
            System.out.println("---------------cpHuman--------------");
            System.out.println(cpHuman.toString());
            stdIn.close();
        }
}