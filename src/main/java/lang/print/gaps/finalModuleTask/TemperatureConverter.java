package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double fahrenheit = (Double.parseDouble(String.valueOf(temperatureCelsius)) * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
