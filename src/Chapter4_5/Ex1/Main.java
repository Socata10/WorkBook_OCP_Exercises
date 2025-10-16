package Chapter4_5.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter temperature: ");
            double temperature = input.nextDouble();
            System.out.println("Convert to (C)elsius or (F)ahrenheit? ");
            char scale = input.next().toUpperCase().charAt(0);
            if(scale == 'C'){
                double celsius = TemperatureConverter.toCelsius(temperature);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, celsius);
            } else if(scale == 'F'){
                double fahrenheit = TemperatureConverter.toFahrenheit(temperature);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, fahrenheit);
            } else {
                System.out.println("Invalid scale. Please enter 'C' or 'F'.");
            }
        }
    }
}
