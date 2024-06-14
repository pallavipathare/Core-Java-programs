package Practice_Problems;

public class DiscountedBill {
    public static void main(String[] args) {
        int billId = 1001, customerId = 101;
        double billAmount = 199.99, discountedBillAmount = 0.0, discount = 2;

        discountedBillAmount = billAmount - billAmount * (discount/100);

        System.out.println("The Bill Id is :" + billId);
        System.out.println("The Customer Id is :" + customerId);
        System.out.println("The Discounted Bill is :" + discountedBillAmount);
    }
}
