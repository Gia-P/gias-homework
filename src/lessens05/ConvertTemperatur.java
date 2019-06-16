package lessens05;

import java.util.Scanner;

public class ConvertTemperatur {

    public static void main(String[] args) {

        Scanner chussTemp = new Scanner(System.in);
        System.out.println("Insert \"F\" if you want Fahrenheit or \"C\" Celsius or \"K\" kelvin");


        // celsius to kelvin; fahrenheit
        Scanner celsius = new Scanner(System.in);
        System.out.println("Insert temperature in celsius");
        double tempCelsius = celsius.nextDouble();
        double celsiusKalvin = (tempCelsius + 273.15);
        String strFormatKalvin = String.format("%.2f", celsiusKalvin);
        System.out.println("Temperature in kalvin is: " + celsiusKalvin + "K");
        double celsiusFahrenheit = (tempCelsius * 1.8) + 32;
        String strFormatFahToCel = String.format("%.2f", celsiusFahrenheit);
        System.out.println("Temperature in fahrenheit is: " + celsiusFahrenheit + "°F");
        System.out.println("As temperature is: " +tempCelsius + "°C; " + strFormatKalvin + "K; " + strFormatFahToCel + "°F");

        // kelvin to celsius; fahrenheit
        Scanner kalvin = new Scanner(System.in);
        System.out.println("Insert temperature in kelvin");
        double tempKelvin = kalvin.nextDouble();
        double kelvinCelsius = tempKelvin - 273.15;
        String strFormatCel = String.format("%.2f", kelvinCelsius);
        System.out.println("Temperature in celsius is: " + kelvinCelsius + "°C");
        double kelvinFahrenheit = (tempKelvin * 9/5) - 459.67;
        String strFormatFah = String.format("%.2f",kelvinFahrenheit);
        System.out.println("Temperature in fahrenheit is: " + kelvinFahrenheit + "°F");
        System.out.println("As temperature is: " + tempKelvin + "K; " + strFormatCel + "°C; " + strFormatFah + "°F");


    }
}
