import java.util.Scanner;
public class TemperatureConversionProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius: ");

        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + tempF);
    }
}
 // O/P:-
//  Please enter the temperature in Celsius: 
// 42.4
// The temperature in Fahrenheit is: 108.32