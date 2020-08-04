import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Roman {
  private String minimum;
  private String middle;
  private String maximum;

  Roman(String minimum, String middle, String maximum) {
    this.minimum = minimum;
    this.middle = middle;
    this.maximum = maximum;
  }


  public static String repeated(String numeral, int repetition) {
    return IntStream.range(0, repetition).mapToObj(i -> numeral).collect(Collectors.joining());
  }


  public String digit(int value) {
    applyRules(value);
    return result;
  }

  boolean applyRules(int value) {
    return rule(value == 4, minimum + middle)
        || rule(value >= 9, repeated(minimum, 10 - value) + maximum)
        || rule(value < 5,  repeated(minimum, value))
        || rule(true,       middle + repeated(minimum, value - 5));
  }


  private boolean rule(boolean expr, String value) {
      return expr && concat(value);
  }

  private boolean concat(String v) {
    result += v;
    return true;
  }
  private String result = "";
}
