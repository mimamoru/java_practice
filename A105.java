import java.util.ArrayList;

public class A105 {
    public static void main(String[] args) {
        var lia=new ArrayList<Integer>();
        lia.add(1);
        lia.add(6);
        lia.add(1);
        lia.add(4);
        lia.add(8);
        lia.add(2);
        var lib=new ArrayList<>();
        lib.add(1);
        lib.add(6);
        lib.add(9);
        var lic=new ArrayList<>();     
        lic.add(0);
        lic.add(4);
        lic.add(8);
        lic.add(1);
        lic.add(3);
        System.out.println("=================");
       // System.out.println(lia.remove(0));
    //    System.out.println(lia.removeAll(lib));
       lia.stream().map(e->e*2).forEach(s->System.out.println(s));     
       lia.replaceAll(e->e*2);
       System.out.println(lia.retainAll(lic));
        System.out.println("----------------");
        lia.forEach(s->System.out.println(s));
        System.out.println(lib.toString()+lib.toString().length());
        System.out.println("=================");
    }
}