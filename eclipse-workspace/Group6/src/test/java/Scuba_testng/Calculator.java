package Scuba_testng;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;



public class Calculator { 
	 @Test (dataProvider = "inputs_1")
	 public static void add(int number1, int number2,int number3) {
	      int a = number1 + number2;
	      Assert.assertEquals(a,number3);
	      Reporter.log("The addition is"+a);
	   }
	 @Test (dataProvider = "inputs",groups = "test")
	   public static void sub(int number1, int number2) {
	      int c = number1 - number2;
	      Reporter.log("The difference is"+c,true);
	   }
	 @Test (dataProvider = "inputs")
	 public static void mul(int number1, int number2) {
	      int d = number1 * number2;
	      Reporter.log("The multiplication value is"+d,true);
	   }
	 
	 @Test (dataProvider = "inputs")
	   public static int divInt(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return number1 / number2;
	   }
	 @DataProvider(name="inputs_1")
		public Object[][] getData1() {
			return new Object[][] {
				{20, 25,45},
				{12, 100,112},
				{35, 50,85}
			};
		}
	 @DataProvider(name="inputs")
		public Object[][] getData() {
			return new Object[][] {
				{20, 25},
				{12, 100},
				{35, 50}
			};
		}
}
