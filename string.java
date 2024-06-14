public class string {
    public static void main(String[] args) throws Exception{
        // String str1 = "Swapnil";
        // String str2 = " Shelke";
        // str.substring(2, 5);
        // System.out.println(str.substring(1));
        // System.out.println(str.trim());
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter range: ");
        // n = scan.nextInt();
        // for (int i=0; i<n; i++ ){
        //     //  System.out.println((i+1) + "." +str);
        // }
        // scan.close();
        // str1.concat("shelke");
        //     // System.out.println(str1);
        //     StringBuffer str3 = new StringBuffer(str1);
        //     str3.append(str2);
        //     System.out.println(str3);
//////////////////////////////////////////////////////////////////
        String str1 = "Swapnil";
        String str2 = " Shelke";
        StringBuilder strb = new StringBuilder();
        strb.append(str1);
        strb.append(str2);
        System.out.println(strb.capacity());
        System.out.println(strb);
        System.out.println(strb.reverse());
        strb.replace(2, 5, str1);
        System.out.println(strb);
    }
}
