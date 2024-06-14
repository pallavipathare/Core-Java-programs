public class Staticvarinstance {
    int eid;
    String name;
    static String company_name = "seed";
    public void show(){
        System.out.println(eid+" "+name+" "+company_name);
    }
    public static void main(String[] args){
        Staticvarinstance sv = new Staticvarinstance();
        sv.eid = 104;
        sv.name = "Swapnil";
        sv.show();
        Staticvarinstance sv1 = new Staticvarinstance();
        sv1.eid = 105;
        sv.name = "Shelke";
        sv.show();
    }
}