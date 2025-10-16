package Chapter4_5.Ex1;

public class TemperatureConverter {
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
