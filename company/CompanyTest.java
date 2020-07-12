package company;

import java.util.Scanner;

public class CompanyTest {
    public static void main(String[] args){
        System.out.println("会社ごとか支店ごとか欲しい情報を入力してください<会社ごと：1、店舗ごと：2>");
            Scanner stdIn=new Scanner(System.in);
            int chose=stdIn.nextInt();
            Info info= new Info();
            if(chose==1){
                info.Select1();
            }else{        
                info.Select2();
            }
            // MakeData data= new MakeData();
            // if(chose==1){
            //     data.Select1();
            // }else{        
            //     data.Select2();
            // }
    }
}