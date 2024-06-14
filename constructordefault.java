public class constructordefault {
    int rank;
    String qul;
    String grade;
    constructordefault(){
        rank = 0;
        qul = "";
        grade = "";
    }
    public static void main(String[] args){
        constructordefault ct = new constructordefault();
        ct.rank = 1;
        ct.grade = "First class with Distintion";
        ct.qul= "BE IT";
        System.out.println(ct.grade + " " + ct.qul + " " + ct.rank);
    }
}
