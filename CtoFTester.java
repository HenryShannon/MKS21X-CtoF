/* What should the function have as parameters? One number, either celsius or fahrunheit
What type should they be? Doubles
What should the functions return? Doubles
*/

public class CtoFTester {
  public double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 9 / 5;
  }

  public static void main(String[] args) {
    System.out.print(fahrenheitToCelsius(212));
    System.out.print(celsiusToFahrenheit(100));
  }
}
