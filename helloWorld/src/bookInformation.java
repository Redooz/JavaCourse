import java.util.*;

public class bookInformation {
    public static void main(String args[]) {
        String book, author;
        Scanner terminal = new Scanner(System.in);
        System.out.println("Type the book's name: ");
        book = terminal.nextLine();
        System.out.println("Type the author: ");
        author = terminal.nextLine();

        System.out.println(book + " was written by " + author);

        terminal.close();
    }
}
