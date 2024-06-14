public class polymoorphism1 {
    public static void main(String[] args){
        fun a = new fun();
        a.pal(121);
        a.pal(10, 5);
    }
}
class fun{
    public void pal(int a){
        int temp = a, p, check=0;
        while(a>0){
             p = a % 10;
            check = (check * 10) + p;
            a  = a / 10;
        }
        if(temp == check)
        System.out.println("It is a Pallindrom  number");
        else
        System.out.println("It is not a Pallindrom  number");
    }
    public void pal(int a, int b){
        for(int i=1; i<=a; i++){
            int s = b*i;
            System.out.println(b+" x "+i+" = "+s);
        }
    }
}