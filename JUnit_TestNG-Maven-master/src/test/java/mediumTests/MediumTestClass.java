package mediumTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MediumTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  @Test(groups = "Smoke")
  public void testAverageValueOfThreeNumbers(){
    double actualResult = calc.averageValueOfThreeNumbers(10,2,3);
    assertEquals("(10 + 2 + 3)/3 must be 5", 5.0,actualResult);
  }

  //TODO (**)
  @Test
  public void testIsNumberEven(){
    boolean actualResult = calc.isNumberEven(1000);
      assertEquals("1000 % 2 must be 0, true",true,actualResult);
  }

  //TODO (**)
  @Test
  public  void  testBiggestValue(){
    double actualResult = calc.maxValueOfTwoNumbers(18,9);
    assertEquals("18 biggest then 9", 18, actualResult);
  }

}
