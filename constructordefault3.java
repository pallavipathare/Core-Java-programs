public class constructordefault3 {
    int rank;
    String qul;
    String grade;
    constructordefault3(int a, String b, String c){
        rank = a;
        qul = b;
        grade = c;
    }
    constructordefault3(constructordefault3 obj){
        rank = obj.rank;
        qul = obj.qul;
        grade = obj.grade;
    }
    public String toString(){
        return grade + " " + qul + " " + rank;
    }
    public static void main(String[] args){
        constructordefault3 ct = new constructordefault3(1, "First class with Distintion", "BE IT");
        // ct.rank = 1;
        // ct.grade = "First class with Distintion";
        // ct.qul= "BE IT";
        constructordefault3 ct2 = new constructordefault3(ct);
        System.out.println(ct2);
    }
}