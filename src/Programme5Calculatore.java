import java.util.Scanner;

///**
// * Write a program for a calculator with addition, subtraction, multiplication and division
// * methods all with parameters and use string concatenation methods.
// * (Note: Two static and Two instance methods.)
// */
public class Programme5Calculatore {
    // Static methods
    public static void addition(int a, int b){
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }
    public static int subtraction(int a,int b){
        return a - b;
    }
    //instance method
public static void multiplication (int a, int b){
        int result = a * b;
    System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
}
public int division(int a, int b){
        return a / b ;
}

    public static void main(String[] args) {

        //  Scanner declaration for reading input for console
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = Scanner.nextInt();
        System.out.println("Please enter second name :");
        int b = Scanner.nextInt();
        addition(a,b);

        int sunResult = subtraction(a, b);
        System.out.println("The subtraction of " + a + " and " + b + " is : " + sunResult);

        Programme5Calculatore  obj = new Programme5Calculatore();
        obj.multiplication(a, b);

        int divResult = obj.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);
        // closing the scanner object
         Scanner .close();



    }
}
