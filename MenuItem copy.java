public class MenuItem {

    private String name;
    private double price;
    private String category;
//Constructor to initialize the attributes
    public MenuItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;



    }
//Getter method for name
    public String getName() {
        return name;
    }
//Getter method for price
    public double getPrice() {
        return price;
    }
    //Getter method for category
    public String getCategory() {
        return category;
    }
    //Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    //Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }
    //Setter method for category
    public void setCategory(String category) {
        this.category = category;
    }

    //Method to display the items info
    public void displayInfo() {
        System.out.println("Item: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category" + category);
    }

}
