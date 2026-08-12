public class TemperatureConversion {
    public static void main(String[] args) {
        double celsius = 25;
        // Convert Celsius Temp to fahreneit Temp
        // Formula: Fahrenheit = (Celsius × 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
