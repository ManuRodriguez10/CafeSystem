public class Main {
    public static void main (String[] args) {
        MenuItem Bread = new MenuItem("Bread" , 5.0, "Food");
        MenuItem peanutButter = new MenuItem("Peanut Butter" , 3.5, "Food");
        MenuItem milkshake = new MenuItem("Milkshake" , 3.0, "Beverage");
        Order currentOrder = new Order();
        currentOrder.addItem1(Bread);
        currentOrder.addItem2(peanutButter);
        currentOrder.addItem3(milkshake);
        Cafe currentCafe = new Cafe();
        currentCafe.addMenuItem1(Bread);
        currentCafe.addMenuItem2(peanutButter);
        currentCafe.addMenuItem3(milkshake);
        currentOrder.displayOrderDetails();
    }
}
