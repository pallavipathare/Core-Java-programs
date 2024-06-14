public class finallytry {
    public static void main(String[] agrs){
        try{
            int a = 10, b = 20, c;
            c = b / a;
            System.out.println(c);
        }
        finally{
            System.out.println("finally arithmetic Exception");
        }
    }
}