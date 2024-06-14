public class strings {
    public static void main(String[] args) throws Exception{
        String str1 = "Me";
        // System.out.println(str1);
        StringBuffer str3 = new StringBuffer(str1);
        System.out.println(str3.capacity());
        str3.insert(7, " <3 Swapnil :) ");
        // System.out.println(str3);
        // System.out.println(str3.reverse());
        // str3.replace(2, 5, str1);
        System.out.println(str3);
        System.out.println(str3.capacity());
    }
}