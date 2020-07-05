import java.util.Arrays;
import java.util.Comparator;


public class A098 {
   
    
    public static final Comparator<String> STRING_LENGTH_COMARATOR = 
            new Comparator<String>(){ @Override
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }};
    public static void main(String[] args) {
        String a[]={"am","dbuk","e","n","all","c","euiop","im","pmm","ma"};
        Arrays.sort(a, STRING_LENGTH_COMARATOR);
        // Arrays.sort(a, (o1,o2)-> o1.length()-o2.length());
        System.out.println(Arrays.toString(a));
        System.out.println("-------------------");
        for(String aa:a){
        System.out.println(aa);}
        System.out.println("=================");
        String b[][]={{"a","d","e","n"},{"a","c","e","i","p","m"}};
        Arrays.sort(b,
        ( o1,  o2)->{ Arrays.sort(o1);Arrays.sort(o2);
          return  o1.length-o2.length; }
        );
        for(String[] bb:b){
            for(String bbb:bb){
                System.out.println(bbb);
            }
            System.out.println();
    }
}}