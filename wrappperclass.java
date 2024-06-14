public class wrappperclass {
    public static void main(String[] args) {
        
        Integer iob = 100;  // auto boxing
        int i = iob;        //auto unboxing
        System.out.println(i+" "+iob);

        Character cob='a'; //auto boxing
        char ch = cob;     //auto unboxing
        System.out.println(cob+" "+ch);
    }
}