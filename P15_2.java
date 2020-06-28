public class P15_2 {
   // public String[] st = new String[6];
   // st[0]=new String();
  //  public String[] yobi= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    public static void main(String[] args) {

    char[] c={'a','b','c','d','e','f','g','1'};
    String[] s={"Sun","Mon","Tue","Wed","Thu","Fri","Sat",null};
    String[] str = new String[13];
    str[0]=new String();
    str[1]=new String(c);
    str[2]=new String(c,2,3);
    str[3]=new String("");
    str[4]=new String(s[0]);
    str[5]=new String("Sun");
    str[6]=new String("Sun");
    str[7]= null;
    str[8]=s[0];
    str[9]="Sun";  
    str[10]="";
    str[11]="Sun";
    str[12]=str[11];
    str[11]="Mon";
    //s[0]="Mon";
    s=new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        for(String st:str){
        System.out.println(st);
    }
    System.out.println((str[5]==str[6]));
    System.out.println((str[4]==str[6]));
    System.out.println((str[3]==str[10]));
    System.out.println((str[4]==str[8]));
    System.out.println((str[5]==str[9]));
    System.out.println((str[11]==str[9]));
    System.out.println((str[8]==str[9]));
    System.out.println((str[7]==str[12]));
    System.out.println((str[11]==str[12]));
    System.out.println((str[9]==str[12]));
    System.out.println((s[6]==str[12]));
}
}