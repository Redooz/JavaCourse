import java.util.*;

public class App {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        String client,category,cent = "";
        int i = 0;    
        double price = 0,finalPrice = 0;

        System.out.println("Type your name:");
        client = terminal.nextLine();
        do {
            System.out.println("Type your category: A,B,C,Other");
            category = terminal.nextLine();

            switch (category) {
                case "A","a":
                    price = 2500;
                    
                    System.out.println("Category A\n");
                    System.out.println("Its price is $" + price);
                    break;
            
                case "B","b":
                    price = 5200;

                    System.out.println("Category B\n");
                    System.out.println("Its price is $" + price);
                    break;

                case "C","c":
                    price = 12000;

                    System.out.println("Category C\n");
                    System.out.println("Its price is $" + price);
                    break;

                case "Other","other","o","O":
                    price = 25000;

                    System.out.println("Category Other\n");
                    System.out.println("Its price is $" + price);
                    break;

                default:
                    System.out.println("ERROR: Type a valid option. ");
                    i--;
                    break;
            }
            
            finalPrice += price;

            i++;

            System.out.println("Do you want to continue? Y/N");
            cent = terminal.nextLine();
        } while (cent.toLowerCase().equals("y"));

        System.out.println("Total price: $" + finalPrice);

        System.out.println("\n"+ client + " has done this operation " + i + " times.");

        terminal.close();
    }
}
