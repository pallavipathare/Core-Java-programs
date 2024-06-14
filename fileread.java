import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class fileread {
    public static void main(String[] args){
        try{
            File f = new File("C:\\Users\\shelk\\Java\\src\\newfile1.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}