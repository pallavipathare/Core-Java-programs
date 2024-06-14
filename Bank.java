public class Bank {
    String name;
    int acnumber;
    String type;
    float bal;
    float amount;

    public void getData(String name, int acnumber, String type, float bal, float amount) {
        this.name = name;
        this.acnumber = acnumber;
        this.type = type;
        this.bal = bal;
        this.amount = amount;
    }

    public float deposit(float depositAmount) {
        this.amount = depositAmount;
        this.bal += depositAmount;
        return this.amount;
    }

    public void display() {
        try {
            System.out.println("Name: " + this.name);
            System.out.println("Deposit: " + this.amount);
            System.out.println("Balance: " + this.bal);
        } catch (Exception e) {
            System.out.println("An error occurred while displaying the details.");
        }
    }
}