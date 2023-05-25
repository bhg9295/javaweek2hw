import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7TempConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  temperature in fahreheit :");
        float temp = scanner.nextFloat();
        // object creation
        Programme7TempConversion t = new Programme7TempConversion();
        t.convertTempToDegreeCelsius(temp);
        // Closing the scanner object
        scanner.close();
    }

    // Temp conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp - 32)* 5 /9);
        System.out.println("The temp "+temp+"fahrenheit is equal to"+c+"degree celsius");
    }
}
