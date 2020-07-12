package company;

import java.util.ArrayList;
import java.util.Scanner;

public class Info {

    public void Select1(){
       MakeData md= new MakeData();
       ArrayList<Parent> list = md.Select1();
       Parent.print(list);
    }

    public void Select2(){
        System.out.println("会社名を入力してください。<番号を入力>");
        Scanner stdIn=new Scanner(System.in);
        int chose=stdIn.nextInt();
        MakeData md= new MakeData(); 
        ArrayList<Child> list = md.Select2(chose);
        Child.print(list);
    }

    public ArrayList<Product> Select3(int id){
        // MakeData md= new MakeData();
        // ArrayList<Product> list = new MakeData().Select3(id);
        return new MakeData().Select3(id);
     }

     public ArrayList<String> Select4(int id){
        return new MakeData().Select4(id);
     }
 
}