public class constructordefault1 {
    int rank;
    String qul;
    String grade;
    constructordefault1(){
        rank = 0;
        qul = "";
        grade = "";
    }
    public String toString(){
        return grade + " " + qul + " " + rank;
    }
    public static void main(String[] args){
        constructordefault1 ct = new constructordefault1();
        ct.rank = 1;
        ct.grade = "First class with Distintion";
        ct.qul= "BE IT";
        System.out.println(ct);
    }
}