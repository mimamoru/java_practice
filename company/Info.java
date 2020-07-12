package company;

import java.util.ArrayList;
import java.util.Scanner;

public class Info {

    public void Select1(){
       Parent.print(new MakeData().Select1());
    }

    public void Select2(){
        System.out.println("会社名を入力してください。<番号を入力>");
        Scanner stdIn=new Scanner(System.in);  
        Child.print(new MakeData().Select2(stdIn.nextInt()));
    }

    public ArrayList<Product> Select3(int id){
        return new MakeData().Select3(id);
     }

     public ArrayList<String> Select4(int id){
        return new MakeData().Select4(id);
     }
 
}