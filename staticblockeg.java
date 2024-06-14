public class staticblockeg {
    int sid, smarks;
    String name;
    static int instutecode, Subcode;
    static{
         instutecode = 101;
         Subcode = 123;
    }
    public void show(){
        System.out.println(sid+" "+smarks+" "+name+" "+instutecode+" "+Subcode);
    }
    public static void main(String[] args){
        staticvarinstance1 sv = new staticvarinstance1();
        sv.sid = 104;
        sv.smarks = 90;
        sv.name = "Swapnil";
        sv.show();
        staticvarinstance1 sv1 = new staticvarinstance1();
        sv1.sid = 105;
        sv1.smarks = 95;
        sv1.name = "Shelke";
        sv1.show();
        staticvarinstance1 sv2 = new staticvarinstance1();
        sv2.sid = 103;
        sv2.smarks = 80;
        sv2.name = "Swapy";
        sv2.show();
        staticvarinstance1 sv3 = new staticvarinstance1();
        sv3.sid = 101;
        sv3.smarks = 100;
        sv3.name = "Anon";
        sv3.show();
        staticvarinstance1 sv4 = new staticvarinstance1();
        sv4.sid = 102;
        sv4.smarks = 105;
        sv4.name = "Ghost";
        sv4.show();
    }
}