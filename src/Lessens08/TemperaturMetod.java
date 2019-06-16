package Lessens08;

public class TemperaturMetod {

    public String getFahrToCel (double fahrenheit){
        // Formula Fahrenheit
        double celsiusFrom = (fahrenheit - 32) * 5/9;
        String celsius = String.format("%.2f", celsiusFrom);
        return celsius;
    }

    public String getFahrToKelv (double fahrenheit){
        double kelvinFrom = (fahrenheit + 459.67) * 5/9;
        String kelvin = String.format("%.2f", kelvinFrom);
        return kelvin;
    }

    public String getCelToFahr (double celsius){
        double fahrenheitFrom = (celsius  * 5/9) + 32;
        String fahrenheit = String.format("%.2f", fahrenheitFrom);
        return fahrenheit;
    }

    public String getCelToKelv (double celsius){
        double kelvinFrom = celsius + 273.15;
        String kelvin = String.format("%.2f", kelvinFrom);
        return kelvin;
    }
    public String getKelvToFahr (double kelvin){
        double fahrenheitFrom = (kelvin  * 5/9) + 459.67;
        String fahrenheit = String.format("%.2f", fahrenheitFrom);
        return fahrenheit;
    }

    public String getKelvToCel (double kelvin){
        double celsiusFrom = kelvin - 273.15;
        String celsius = String.format("%.2f", celsiusFrom);
        return celsius;
    }
}
