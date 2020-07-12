package company;

import java.util.Scanner;

public class CompanyTest {
    public static void main(String[] args){
        int flg=1;
        do{
        System.out.println("会社ごとか支店ごとか欲しい情報を入力してください<会社ごと：1、店舗ごと：2>");
            Scanner stdIn=new Scanner(System.in);
            int chose=stdIn.nextInt();
            Info info= new Info();
            if(chose==1){
                info.Select1();
            }else{        
                info.Select2();
            }
            stdIn.close();
         System.out.println("続けますか？<はい。：1、いいえ。：2>");
         flg=stdIn.nextInt();
        }while(flg==1);
    }
}