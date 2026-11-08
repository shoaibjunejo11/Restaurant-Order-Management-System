
public class Order {

    private int orderId;
    private String customerName;
    private String foodItem;
    private int quantity;

    // Constructor
    public Order(int orderId, String customerName,
                 String foodItem, int quantity) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
    }

    // Getter method
    public int getOrderId() {
        return orderId;
    }

    // Display order details
    public void displayOrder() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
    }
}
