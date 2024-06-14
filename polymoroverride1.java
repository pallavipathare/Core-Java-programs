public class polymoroverride1 {
    public static void main(String[] args){
    evenodd obj1 = new evenodd();
    fatcorial obj2 = new fatcorial();
    amstrong obj3 = new amstrong();
    obj1.name();
    obj2.name();
    obj3.name();
    }
}
class evenodd {
    public void name(){
        int a = 12;
        if(a % 2 ==0)
            System.out.println("Its even");
        else
            System.out.println("Its odd");
    }
}
class fatcorial extends evenodd{
    public void name(){
        int fact = 1, i, n = 5;
        for(i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Value of Factorial is " + fact);
    }
}
class amstrong extends evenodd{
    public void name(){
    int n = 153, r, sum = 0, temp;
    temp = n;
    while(n>0){
         r = n % 10;
         sum = sum + (r * r * r);
         n = n / 10;
    }
    if(sum == temp)
    System.out.println("\nIt is a Armstong number");
    else
    System.out.println("\nIt is not a Armstrong number");
    }
}