package Lessens08;

public class TemperatureCalculator {



    public static void main(String[] args) {

        double fahrenheit = 32;
        double celsius = 0;
        double kelvin = 300;

        TemperaturMetod temperaturMetod = new TemperaturMetod();
        String baseTemperatur;
        String comeTemperatur;
        // Calculate Fahrenheit to Celsius
        String celsiusToFahren = temperaturMetod.getFahrToCel(fahrenheit);
        baseTemperatur = "When Fahrenheit is ";
        comeTemperatur = " Then Celsius will be ";
        System.out.println(baseTemperatur + fahrenheit + comeTemperatur + celsiusToFahren);
        // Calculate Fahrenheit to Kelvin
        String kelvinToFahren = temperaturMetod.getFahrToKelv(fahrenheit);
        baseTemperatur = "When Fahrenheit is ";
        comeTemperatur = " Then Kelvin will be ";
        System.out.println(baseTemperatur + fahrenheit + comeTemperatur + kelvinToFahren);
        // Calculate Celsius to Fahrenheit
        String fahrenheitToCel = temperaturMetod.getCelToFahr(celsius);
        baseTemperatur = "When Celsius is ";
        comeTemperatur = " Then Fahrenheit will be ";
        System.out.println(baseTemperatur + celsius + comeTemperatur + fahrenheitToCel);
        // Calculate Celsius to Kelvin
        String kelvinToCel = temperaturMetod.getCelToKelv(celsius);
        baseTemperatur = "When Celsius is ";
        comeTemperatur = " Then Kelvin will be ";
        System.out.println(baseTemperatur + celsius + comeTemperatur + kelvinToCel);
        // Calculate Kelvin to Fahrenheit
        String fahrenheitToKelv = temperaturMetod.getKelvToFahr(kelvin);
        baseTemperatur = "When Kelvin is ";
        comeTemperatur = " Then Fahrenheit will be ";
        System.out.println(baseTemperatur + kelvin + comeTemperatur + fahrenheitToKelv);
        // Calculate Kelvin to Celsius
        String celsiusToKelv = temperaturMetod.getKelvToCel(kelvin);
        baseTemperatur = "When Kelvin is ";
        comeTemperatur = " Then Celsius will be ";
        System.out.println(baseTemperatur + kelvin + comeTemperatur + celsiusToKelv);
    }
}
