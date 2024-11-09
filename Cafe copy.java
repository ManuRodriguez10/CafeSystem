public class Cafe {
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;

    private Order currentOrder;

    //addMenuItem1
    public void addMenuItem1(MenuItem item) {
        this.item1 = item;
    }

    //addMenuItem2
    public void addMenuItem2(MenuItem item) {
        this.item2 = item;
    }

    //addMenutItem3
    public void addMenuItem3(MenuItem item) {
        this.item3 = item;
    }

    //Place order method
    public void placeOrder (Order order) {
        this.currentOrder = order;
        this.currentOrder.calculateTotal();
        this.currentOrder.displayOrderDetails();
    }
    //Display menu method
    public void displayMenu() {
        item1.displayInfo();
        item2.displayInfo();
        item3.displayInfo();
    }
}
