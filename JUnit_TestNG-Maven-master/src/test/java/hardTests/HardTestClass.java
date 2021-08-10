package hardTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HardTestClass {

  Calculator calc = new Calculator();

  //TODO (**)
  @Test(expectedExceptions = ArithmeticException.class)
  public  void testCheckDivisionByZero(){
    int actualResult = calc.checkDivisionByZero(5, 0);
    assertEquals("5/0 must return -100", -100, actualResult);
  }

  //TODO (**)
  @Test
  public  void  testSumOfQuantityParameters(){
    double actualResult = calc.sumOfQuantityParameters(1,2,3);
    assertEquals("1+2+3 must be 6", 6, actualResult);
  }


}
