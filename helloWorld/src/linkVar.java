public class linkVar {
    public static void main(String args[]) {
        String user = "Juan", position = "Engineer";
        int n1 = 5, n2 = 3;
        var userPosition = user + " " + position;
        System.out.println(userPosition);
        System.out.println(n1 + n2 + userPosition);
        System.out.println(userPosition + n1 + n2); //You won't see the addition
        System.out.println(userPosition + (n1 + n2)); //You will see the addition
    }   
}
