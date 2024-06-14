public class constructordefault2 {
    int rank;
    String qul;
    String grade;
    constructordefault2(int a, String b, String c){
        rank = a;
        qul = b;
        grade = c;
    }
    public String toString(){
        return grade + " " + qul + " " + rank;
    }
    public static void main(String[] args){
        constructordefault2 ct = new constructordefault2(1, "First class with Distintion", "BE IT");
        // ct.rank = 1;
        // ct.grade = "First class with Distintion";
        // ct.qul= "BE IT";
        System.out.println(ct);
    }
}