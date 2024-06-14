public class abstractionexample3 implements pattern, pattern1, pattern2, pattern3{
    public static void main(String[] args){
        abstractionexample3 ob = new abstractionexample3();
        ob.patternstar();
        System.out.println();
        ob.patternstar1();
        System.out.println();
        ob.patternstar2();
        System.out.println();
        ob.patternstar3();
    }
    public void patternstar(){
         //pattern 1
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void patternstar1(){
         //pattern 2
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                if(i==0 || j==0 || i==3 || j==4){
                    System.out.print("*");
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public void patternstar2(){
        //pattern 3
        for(int i=0; i<4; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=4; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void patternstar3(){
         //pattern 4
        for(int i=0; i<8; i++){
            for(int j=0; j<8-i; j++){
                System.out.print(' ');
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
interface pattern{
    void patternstar();
}
interface pattern1{
  void patternstar1();
}
interface pattern2{
    void patternstar2();
}
interface pattern3{
    void patternstar3();
}       