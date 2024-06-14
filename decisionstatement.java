import java.util.Scanner;

public class decisionstatement {
    public static void main(String1[] args){

    Scanner scan = new Scanner(System.in);

// 1. eligibility of admission
    int math, phy, chem, total;
    System.out.println("Enter marks in Maths");
    math = scan.nextInt();
    System.out.println("Enter marks in  Physics");
    phy = scan.nextInt();
    System.out.println("Enter marks in Chemistry");
    chem = scan.nextInt();

    total = math + phy + chem;

    if (math >= 65 && phy >= 55 && chem >= 50 && total >= 180){
        System.out.println("The candidate is eligible for admission.");
    }else{
        System.out.println("The candidate is not eligible for admission.");
    }


// 2. check whether it is vowel or consonant
 char c;
  c = scan.next().charAt(0);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
    System.out.println("is a vowel");
    else
    System.out.println("is not a vowel");


// 3. Calculate percentage and grade 
Float phy1, chem1, bio1, math1, comp1; 
double total1, percentage1;
char grade1;
System.out.println("Enter marks of five subjects:");
phy1 = scan.nextFloat();
chem1 = scan.nextFloat();
bio1 = scan.nextFloat();
math1 = scan.nextFloat();
comp1 = scan.nextFloat();

total1 = phy1 + chem1 + bio1 + math1 + comp1;
percentage1 = (total1 / 500.0) * 100;
if(percentage1 >= 90)
grade1 = 'A';
else if(percentage1 >= 80)
grade1 = 'B';
else if(percentage1 >= 70)
grade1 = 'C';
else if(percentage1 >= 60)
grade1 = 'D';
else if(percentage1 >= 40)
grade1 = 'E';
else
grade1 = 'F';

System.out.println("Your Percentage is " + percentage1);
System.out.println("Your grade is " + grade1);


//4. electricity bill
int unit;
double amt, total_amt, sur_charge;

System.out.println("\"Enter total units consumed: ");
unit = scan.nextInt();
if(unit <=50) {
    amt = unit * 0.50;
} else if(unit <=150) {
    amt = 25 + ((unit-50) * 0.75);
} else if(unit <=250) {
    amt = 100 + ((unit-150) * 1.20);
} else {
    amt = 220 + ((unit-250) * 1.50);
}

sur_charge = amt * 0.20;
total_amt  = amt + sur_charge;
System.out.println("Electricity Bill = Rs." + total_amt);

 // 5. Gross salary
 double basic, gross, da, hra;
 System.out.println("Enter basic salary of an employee: ");
 basic = scan.nextDouble();
 if(basic <=10000) {
    hra = basic * 0.2;
    da = basic * 0.8;
} else if(basic <=20000) {
    hra = basic * 0.25;
    da = basic * 0.9;
} else {
    hra = basic * 0.3;
    da = basic * 0.95;
}

gross = basic + hra + da;

System.out.println("Gross salary of employee = Rs. " + gross);


// 6. divisible by 5 and 11
int num;
System.out.println("Enter any number: ");
num = scan.nextInt();
if((num %5 ==0) && (num %11 ==0)){
    System.out.println("Number is divisible by 5 and 11");
}else {
    System.out.println("Number is not divisible by 5 and 11");
}
scan.close();
    }
}