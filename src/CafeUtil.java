import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName);
        int pos = customers.size();
        System.out.println("There are " + pos + " ahead of you");
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        double discount = 0.0;

        for (int i = 1; i <= maxQuantity; i++) {
            double totalCost = discount + (price * i);
            System.out.printf("%d - $%.2f\n", i, totalCost);
            discount -= 0.50;
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s -- $%.2f\n" ,i,menuItems.get(i),prices.get(i));
        }
        return true;
    }

    public void addCustomers(){
    ArrayList<String> customers = new ArrayList<String>();
    Scanner sc  =new Scanner(System.in);
    String input;
        System.out.println("Enter customer names (type 'q' to finish):");
    while (true){
       input=sc.nextLine();
       if (input.equalsIgnoreCase("q")){
           break;
       }
       customers.add(input);
    }
        System.out.println("Customers entered:");
        for (String customer : customers) {
            System.out.println(customer);
    }
}}