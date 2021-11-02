import java.util.*;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade;
        
        System.out.println("Type your note: ");
        grade = sc.nextInt();

        switch (grade) {
            case 10,9:
                System.out.println("Your grade is A");
                break;
            case 8: 
            System.out.println("Your grade is B");
                break;
            case 7: 
                System.out.println("Your grade is C");
                break;
            case 6: 
                System.out.println("Your grade is D");
                break;
            case 5,4,3,2,1,0: 
                System.out.println("Your grade is F");
                break;
            default:
                System.out.println("ERROR: Type a valid grade.");
                break;
        }

        if (grade == 9 || grade == 10) {
            System.out.println("Your grade is A");
        } else {
            if (grade == 8) {
                System.out.println("Your grade is B");
            } else {
                if (grade == 7) {
                    System.out.println("Your grade is C");
                } else {
                    if (grade == 6) {
                        System.out.println("Your grade is D");
                    } else {
                        if (grade >= 0 || grade <= 5) {
                            System.out.println("Your grade is F");
                        } else {
                            System.out.println("ERROR: Type a valid grade. ");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
