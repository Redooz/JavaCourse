public class HelloWorld {
    public static void main(String args[]){
        int number = 10, number2 = 12;
        var lastName = "Olmos"; //You don't need to tag your variable with var
        String myName = "Nicolas";
        System.out.println("Hola Mundo desde Java");
        System.out.println(number);
        number = number+number2; 
        System.out.println(number);
        System.out.println("Hi "+myName+" "+lastName);
        System.out.println("Bye "+myName+" " +lastName);
        
    }
}