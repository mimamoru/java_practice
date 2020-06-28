import java.util.Collections;
import java.util.ArrayList;

public class A108 {
    public static void main(String[] args) {
        var lia=new ArrayList<Integer>();
        lia.add(1);
        lia.add(6);
        lia.add(1);
        lia.add(4);
        lia.add(8);
        lia.add(2);
        var lib=new ArrayList<Integer>();
        lib.add(1);
        lib.add(6);
        lib.add(9);
        lib.add(6);
        var lic=new ArrayList<Integer>();     
        lic.add(0);
        lic.add(4);
        lic.add(8);
        lic.add(1);
        lic.add(3);
        System.out.println("=================");
       
        Collections.sort(lia, (o1,o2)-> o2-o1);
        System.out.println(lia.toString());
        System.out.println("-------------------");
        for(int aa:lia){
        System.out.println(aa);}
        System.out.println("=================");
        lib.sort((o1,o2)-> o2-o1);
        System.out.println(lib);
        Integer[] i=new Integer[lic.size()];
		lic.toArray(i);
       //[] ob=lic.toArray();
}
}