import java.util.*;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam = 0, sum = 0;

        System.out.print("Type a size for your array: ");
        tam = sc.nextInt();

        int[] numbers = new int[tam];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + " - ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Typed numbers: ");

        for (int j = 0; j < numbers.length; j++) {
            System.out.print((j + 1) + " - ");
            System.out.println(numbers[j]);
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array is: " + sum);

        sc.close();
    }
}
