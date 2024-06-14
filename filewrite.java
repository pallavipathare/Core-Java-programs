import java.io.FileWriter;
import java.io.*;
public class filewrite {
    public static void main(String[] args){
        try{
            File f1 = new File("C:\\Users\\shelk\\Java\\src\\newfile.txt");
            String str = "Write this string ";
            FileWriter fw = new FileWriter(f1);
            fw.write(str);
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
