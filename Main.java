
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        OrderQueue queue = new OrderQueue();

        int nextOrderId = 1;
        int choice;

        do {
            System.out.println("\n===== RESTAURANT ORDER MANAGEMENT =====");
            System.out.println("1. Add New Order");
            System.out.println("2. Process Next Order");
            System.out.println("3. Display Pending Orders");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer Name: ");
                    String customer = input.nextLine();

                    System.out.print("Enter Food Item: ");
                    String food = input.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = input.nextInt();
                    input.nextLine();

                    Order order = new Order(
                        nextOrderId,
                        customer,
                        food,
                        quantity
                    );

                    queue.addOrder(order);

                    System.out.println("Order Added Successfully!");
                    System.out.println("Order ID: " + nextOrderId);

                    nextOrderId++;
                    break;

                case 2:
                    Order processed = queue.processNextOrder();

                    if (processed == null) {
                        System.out.println("No Orders Available!");
                    } else {
                        System.out.println("Order Processed:");
                        processed.displayOrder();
                    }
                    break;

                case 3:
                    queue.displayOrders();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        input.close();
    }
}
