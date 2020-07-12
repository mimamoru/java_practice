package vendingmachine;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
public class MachineTest {
    public static void main(String[] args) throws IOException{
       
        Path path = Paths.get("/Users","furukawamimi","Desktop","practice","vendingmachine","products.txt");
        Charset charset = Charset.forName("UTF-8");
        // Files.createFile(path);
        List<String> list = new ArrayList<>(Arrays.asList(
            "aaa,120,12",
            "bbb,200",
            "aaccca,432",
            "ddd,900",
            "eee,90",
            "ffff,100,4",
            "gggg,210,6",
            "hhhh,120",
            "iiii,150",
            "jj,120,2",
            "dks,220,5",
            "svl,10,5",
            "d;ald,120",
            "afvv,160,6",
            "q@@ppp,120",
            "mzmcs,120,3",
            "scbai,500",
            "asdaposv,300",
            "asjfcas,1000,10"    
             ));
        try {
            Files.write(path,list,charset,StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        ArrayList<Product> products = new ArrayList<>();
        try {
            List<String> line = Files.readAllLines(path,charset);
            int idx=0;
            Pattern pat = Pattern.compile(".+,[0-9]+,[0-9]+");
           
            for (String ss : line) {
                if(!pat.matcher(ss).matches()){
                ss+=",-1";
                }
                if(!pat.matcher(ss).matches()){
                   continue;
                    }
                String[] pro=ss.split(",");
                Product p=new Product(++idx,pro[0],Integer.parseInt(pro[1]),Integer.parseInt(pro[2]));   
               
                
                products.add(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        VendingMachine.greet(products);     
    }
}