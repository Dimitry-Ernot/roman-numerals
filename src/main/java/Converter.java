

public class Converter {
  private int value;
  private int base;
  private String repr = "";

  private Converter(int originalValue) {
    this.value = originalValue;
    this.base = 10000;

    apply("M");
    apply("C", "D", "M");
    apply("X", "L", "C");
    apply("I", "V", "X");
  }

  private void apply(String minimum, String middle, String maximum) {
    base /= 10;
    repr += convert(value, base, new Roman(minimum, middle, maximum));
    value = value % base;
  }

  private void apply(String lastRange) {
    apply(lastRange, lastRange, lastRange);
  }


  static String toRomanNumerals(int value) {
    return new Converter(value).repr;
  }


  private static String convert(int value, int base, Roman range) {
    return range.digit(value / base);
  }

}
