import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int large,width;

        System.out.println("Type the large: ");
        large = terminal.nextInt();

        System.out.println("Type the width: ");
        width = terminal.nextInt();

        System.out.println("Perimeter: " + (2*(large+width)));
        System.out.println("Area: " + (large*width));

        terminal.close();
    }
}
