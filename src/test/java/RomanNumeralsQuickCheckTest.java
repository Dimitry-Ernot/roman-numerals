import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class RomanNumeralsQuickCheckTest {

  @Property
  @DisplayName("Should not return a digit more than 4 times")
  public void test11(@InRange(minInt = 1, maxInt = 4000) int numericValue) {
    final  String result = Converter.toRomanNumerals(numericValue);
    Assertions.assertTrue(occurenceOfLetter(result, 'M') < 5);

  }

  private long occurenceOfLetter(String s, char c) {
    return s.chars().filter(ch -> ch == c).count();
  }
}
