import java.awt.*;

public class Order {

    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private double totalAmount;

    //addItem1
    public void addItem1(MenuItem item) {
    this.item1 = item;
    }

    //addItem2
    public void addItem2(MenuItem item) {
        this.item2 = item;
    }
    //addItem3
    public void addItem3(MenuItem item) {
        this.item3 = item;
    }

    //calculateTotal()
    public void calculateTotal() {
        totalAmount = 0.0;
        if (item1 != null) totalAmount += item1.getPrice();
        if (item2 != null) totalAmount += item2.getPrice();
        if (item3 != null) totalAmount += item3.getPrice();
    }

    //displayOrderDetails
    public void displayOrderDetails() {
        System.out.println("Your order: ");
        if (item1 != null) item1.displayInfo();
        if (item2 != null) item2.displayInfo();
        if (item3 != null) item3.displayInfo();
        calculateTotal();
        System.out.println("Total: $" + totalAmount);
    }
}
