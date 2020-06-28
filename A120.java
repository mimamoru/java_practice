////import java.util.Collections;
import java.util.HashMap;
//import java.util.ArrayList;

public class A120 {
    public static void main(String[] args) {
        var mapa=new HashMap<Integer,String>();
        mapa.put(1,"anh");
        mapa.put(6,"ac");
        mapa.put(1,"cda");
        mapa.put(4,"a,l");
        mapa.put(8,"a0000");
        mapa.put(2,"aytdcu");
        var mapb=new HashMap<Integer,String>();
        mapb.put(1,"bbbkd");
        mapb.put(6,"b35xd");
        mapb.put(9,"bri;d");
        var mapc=new HashMap<Integer,String>();     
        mapc.put(0,"b:@kd");
        mapc.put(4,"bswrd");
        mapc.put(8,"hjvi@bd");
        mapc.put(1,"gvi:-bd");
        mapc.put(3,"b];]];d");
        System.out.println("=================");
       
       
        System.out.println(mapa.remove(0));
        System.out.println("-------------------");
       
        System.out.println(mapa);
        System.out.println("=================");
       
}
}