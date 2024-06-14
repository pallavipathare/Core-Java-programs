public class classherar {
    public static void main(String[] args){
        garndchild gc = new garndchild();
        gc.p();
        gc.c22();
        gc.gc();
    }
}
class parent{
    public void p(){
        int a = 66;
        int a1 = 104;
        int a2 = 97;
        int a3 = 114;
        int a4 = 97;
        int a5 = 116;
        char z = (char) a;
        char z1 = (char) a1;
        char z2 = (char) a2;
        char z3 = (char) a3;
        char z4 = (char) a4;
        char z5 = (char) a5;
        System.out.println("dad's name is "+ z + z1+ z2+ z3 + z4 + z5);

        int aq = 75;
        int aq1 = 105;
        int aq2 = 114;
        int aq3 = 97;
        int aq4 = 110;
        char zq = (char) aq;
        char zq1 = (char) aq1;
        char zq2 = (char) aq2;
        char zq3 = (char) aq3;
        char zq4 = (char) aq4;
        System.out.println("mom's name is "+ zq + zq1+ zq2+ zq3 + zq4);
    }
}
class child1 extends parent{
    public void c22(){
        int a = 83;
        int a1 = 119;
        int a2 = 97;
        int a3 = 112;
        int a4 = 110;
        int a5 = 105;
        int a6 = 108;
        char z = (char) a;
        char z1 = (char) a1;
        char z2 = (char) a2;
        char z3 = (char) a3;
        char z4 = (char) a4;
        char z5 = (char) a5;
        char z6 = (char) a6;
        System.out.println("their child name is "+ z + z1+ z2+ z3 + z4 + z5 +z6);
    }
}

class garndchild extends child1{
    public void gc(){
        System.out.println("about my child? I am not married yet");
    }
}

