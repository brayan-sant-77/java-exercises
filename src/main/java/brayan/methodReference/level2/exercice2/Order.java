package brayan.methodReference.level2.exercice2;

public class Order {
    private String customerName;
    private double totalPrice;

    public Order(String customerName, double totalPrice) {
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
