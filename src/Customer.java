public class Customer {


    private String customerName;

    private  double balance ;



    public Customer(String name, double balance) {
        this.customerName=name;
        this.balance = balance;
    }


    public String getName() {
        return customerName;
    }


    public void setName(String name) {
        this.customerName = name;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

}
