package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SimpleTestClass {

  Calculator calc = new Calculator();

  @Test(groups = "Regression")
  public void testAddTwoPositiveValues() {
    int actualResult = calc.add(10, 5);
    assertEquals("10 + 5 must be 15", 15, actualResult);
  }

  // TODO (*)

  @Test
  public void testSubtractionTwoValues(){
    int actualResult = calc.substractionTest(6,2);
    assertEquals("6 - 2 must be 4", 4,actualResult);
  }

  @Test
  public  void testMultiplicationTwoValues(){
    int actualResult = calc.multiplicationTest(5,5);
      assertEquals("5 * 5 must be 25", 25,actualResult);
    }

    @Test
  public void testDivisionTwoValues(){
    double actualResult = calc.divisionTest(10,2);
      assertEquals("10 / 2 must be 5", 5,actualResult);
    }

    @Test
  public void   testSquareRoot(){
    double actualResult = calc.testSquareRoot(25);
      assertEquals("sqrt  25 must be 5", 5,actualResult);
    }

    @Test
  public void testElevate(){
    int actualResult = calc.testElevate(4);
      assertEquals("elevate must be 16", 16,actualResult);
    }
  }




