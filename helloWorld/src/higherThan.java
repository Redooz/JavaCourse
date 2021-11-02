import java.util.Scanner;

public class higherThan {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int n1, n2;

        System.out.println("Type a number: ");
        n1 = terminal.nextInt();
        System.out.println("Type a number: ");
        n2 = terminal.nextInt();

        if (n1 == n2) {
            System.out.println(n1 + " and " + n2 + " are equal.");
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " is higher than " + n2);
            } else {
                System.out.println(n2 + " is higher than " + n1);
            }
        }

        terminal.close();
    }
}
