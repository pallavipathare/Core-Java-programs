public class mocktest {
    public static int fact(int i){
        if(i == 0){
            return 1;
        }
        return i*fact(i-1);
    }
    public static void main(String[] args) {
        // int a=1;
        for(int i = 0; i <=4; i++ ){
            for(int j = 0; j <= (4-i); j++){
                System.out.print(" ");
            }
            for(int k = 0; k <=i; k++){
                    System.out.print(" " + fact(i)/(fact(i-k)* fact(k)));
            }
            System.out.println(" ");
        }
    }
}