import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        String name;
        int id;
        double price;
        Boolean freeDelivery;

        System.out.println("Type your name: ");
        name = terminal.nextLine();

        System.out.println("Type the id: ");
        id = terminal.nextInt();

        System.out.println("Type the price: \n");
        price = terminal.nextDouble();

        System.out.println("Type if the delivery is free: ");
        freeDelivery = terminal.nextBoolean();

        System.out.println(name + " #" + id);
        System.out.println("Price: $" + price);
        System.out.println("Free delivery: " + freeDelivery);

        terminal.close();
    }

}
