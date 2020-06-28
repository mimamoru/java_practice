import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;

//import java.util.Collections;
public class A112 {
    public static void main(String[] args) {
        var seta=new HashSet<Integer>();
        seta.add(1);
        seta.add(6);
        seta.add(1);
        seta.add(3);
        seta.add(8);
        seta.add(2);
        var setb=new LinkedHashSet<Integer>();
        setb.add(1);
        setb.add(6);
        setb.add(9);
        setb.add(2);
        setb.add(-2);
        Set<Integer> setc=new TreeSet<>();
        setc.add(0);
        setc.add(4);
        setc.add(8);
        setc.add(1);
        setc.add(3);
        var lib=new ArrayList<Integer>();
        lib.add(8);
        lib.add(6);
        lib.add(9);
        lib.add(6);
        //Set<Integer> setd=new HashSet<Integer>(lib);
        
        System.out.println("=================");    
        System.out.println(seta.toString());
        System.out.println("-------------------");
        for(int aa:seta){
        System.out.println(aa);}
        System.out.println("=================");
        System.out.println(setb.toString());
        System.out.println("-------------------");
        for(int aa:setb){
        System.out.println(aa);}
        System.out.println("=================");
        System.out.println(setc.toString());
        System.out.println("-------------------");
        for(int aa:setc){
        System.out.println(aa);}
        System.out.println("=================");
        //setc.addAll(setb);
        //System.out.println(setc.toString());[-2, 0, 1, 2, 3, 4, 6, 8, 9]
        setb.addAll(setc);
        System.out.println(setb.toString());
        //[1, 6, 9, 2, -2, 0, 3, 4, 8]
        
        setc.addAll(new HashSet<Integer>(lib));
        
        System.out.println(setc);
}
}