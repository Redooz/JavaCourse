import java.util.*;

public class scanner {
    public static void main(String args[]) {
        String user, position;
        Scanner terminal = new Scanner(System.in);
        System.out.println("Write your name: ");
        user = terminal.nextLine();
        System.out.println("Write your position: ");
        position = terminal.nextLine();
        System.out.println("Your name is " + user + " and your position is " + position);

        terminal.close();
    }
}
