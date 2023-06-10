package day28_Review_Encapslation;

public class Product {

	public String name;
    public double price;
    public int serialNumber;
    public int quantity;

    
    public Product() {
        
    }
    // Constructor method to intialize the instance variables
    public Product(String name, double price, int serialNumber, int quantity) {
        this.name = name;
        this.price = price;
        this.serialNumber = serialNumber;
        this.quantity = quantity;
    }

    // Instance methods to calculate the total price of the product
    public double calculateTotalPrice() {
        double totalPrice = this.price * quantity;
        return totalPrice;
    }
    
    public void getProductDetails() { // Instance Method to get the product details of all the instance variables
        System.out.println("Product: " + name + "\nPrice: $" + price + "\nSerial Number: " + serialNumber
                + "\nQuantity: " + quantity);
    }
    // We are checking if the product is avaialble or not. (It will either give us true or false)
    public boolean isAvailable() { 
        return quantity > 0;
    }
    // decreasing quantity of the product by a certain amount
    public void decreaseQuantity(int amount) {
        if(amount > quantity) { // Check if there is enough quantity
            System.out.println("Not enough quantity available");
        } else {
            quantity -= amount;
        }

}}