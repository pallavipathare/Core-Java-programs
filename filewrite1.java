import java.io.File;
import java.io.FileWriter;
public class filewrite1 {
     public static void main(String[] args){
        try{
            File f = new File("C:\\Users\\shelk\\Java\\src\\newfile1.txt");
            String s = "Hello! Good Morning. Myself Swapnil. \n";
            String ss = "Am an IT enginner completed B.E. (I.T) in 2022";
            FileWriter fr = new FileWriter(f);
            fr.write(s);
            fr.append(ss);
            fr.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}