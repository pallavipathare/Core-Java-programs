package Practice_Problems;

public class EmployeeRecord {
    public static void main(String[] args) {
        double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        double averagesal = 0.0;
        int lowsal = 0, highsal = 0;
        for(int i = 0; i < salary.length; i ++){
            averagesal += salary[i];
        }
        averagesal = averagesal / salary.length;
        for(int i = 0; i < salary.length; i ++){
            if(averagesal > salary[i]){
                lowsal ++;
            }
            else{
                highsal ++;
            }
        }
        System.out.println("The average salary of the employee is :" + averagesal);
        System.out.println("The number of employees having salary greater then the average is :" + highsal);
        System.out.println("The number of employees having salary lesser then the average is :" + lowsal);
    }
}
