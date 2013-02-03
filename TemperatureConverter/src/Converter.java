public class Converter {
  public static void main(String[] args) {
    for (double celsius=0.0; celsius <= 100.0; celsius+=10.0) {
      double farenheit = celsius * 9 / 5 + 32;
      System.out.println(String.format("%.0fF = %.1fC", farenheit, celsius, "C"));
    }
  }
}
