import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


class RomanNumeralsTest {
  @Test
  @DisplayName("Can convert a digit 1 to roman numerals I")
  void test1() {
    final String result = Converter.toRomanNumerals(1);
    Assertions.assertEquals("I", result);
  }

  @Test
  @DisplayName("Can convert a digit 2 to roman numerals II")
  void test2() {
    final String result = Converter.toRomanNumerals(2);
    Assertions.assertEquals("II", result);
  }

  @Test
  @DisplayName("Can convert a digit 5 to roman numerals V")
  void test3() {
    final String result = Converter.toRomanNumerals(5);
    Assertions.assertEquals("V", result);
  }

  @Test
  @DisplayName("Can convert a digit 6 to roman numerals VI")
  void test4() {
    final String result = Converter.toRomanNumerals(6);
    Assertions.assertEquals("VI", result);
  }

  @Test
  @DisplayName("Can convert a digit 4 to roman numerals IV")
  void test5() {
    final String result = Converter.toRomanNumerals(4);
    Assertions.assertEquals("IV", result);
  }

  @Test
  @DisplayName("Can convert a digit 9 to roman numerals IX")
  void test6() {
    final String result = Converter.toRomanNumerals(9);
    Assertions.assertEquals("IX", result);
  }

  @Test
  @DisplayName("Can convert a digit 50 to roman numerals L")
  void test7() {
    final String result = Converter.toRomanNumerals(50);
    Assertions.assertEquals("L", result);
  }

  @Test
  @DisplayName("Can convert a digit 30 to roman numerals XXX")
  void test8() {
    final String result = Converter.toRomanNumerals(30);
    Assertions.assertEquals("XXX", result);
  }

  @Test
  @DisplayName("Can convert a digit 300 to roman numerals CCC")
  void test9() {
    final String result = Converter.toRomanNumerals(300);
    Assertions.assertEquals("CCC", result);
  }


  @Test
  @DisplayName("Can convert a digit 3999 to roman numerals MMMCMXCIX")
  void test10() {
    final String result = Converter.toRomanNumerals(3999);
    Assertions.assertEquals("MMMCMXCIX", result);
  }

}
