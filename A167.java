import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
public class A167 {
    public static void main(String[] args) throws java.io.IOException{
        ArrayList<Boolean> li=new ArrayList<>();
        FileSystem fs=FileSystems.getDefault();
        
        Path path1=fs.getPath("/","Users", "furukawamimi","Desktop","practice");
        Path path2=fs.getPath("practice", "test2.text");

        Path path=Paths.get("test3.text");

       
        Path dir=Paths.get("dir");
        Path dir2=Paths.get("dir2");
        Path file=dir.resolve("test4.text");
       
      
        try{
          if(!(Files.exists(dir)||Files.exists(file)||Files.exists(dir2)||Files.exists(path))){
           Files.createDirectory(dir);
           Files.createFile(file);
           Files.createDirectories(dir2);
          // Files.createFile(path);
        }
           }catch(IOException e){
               e.getStackTrace();
               System.out.println("例外発生");
           }
           li.add(Files.exists(path1));
           li.add(Files.exists(path));
           li.add(Files.exists(dir));
           li.add(Files.exists(file));
           li.add(Files.isReadable(dir));
           li.add(Files.isReadable(file));
           li.add(path1.isAbsolute());
           li.add(path2.isAbsolute());
           path1=path1.toAbsolutePath();
           path2=path2.toAbsolutePath();
           li.add(path1.isAbsolute());
           li.add(path2.isAbsolute());
           
           try{
           Files.move(file, dir2.resolve("test5.text"));
        }catch(IOException e){
            e.getStackTrace();
            System.out.println("例外発生2");
        }
        System.out.println(li);
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(dir2.toAbsolutePath());
        System.out.println(file.toAbsolutePath());
        System.out.println("---------------------");
        System.out.println(file.getParent());
        System.out.println(path1.getParent());
        System.out.println(dir2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(dir.getRoot());
    }
}