import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;



public class Calculator { 
	 @Test (dataProvider = "inputs")
	 public static void add(int number1, int number2) {
	      int a = number1 + number2;
	      Reporter.log("The difference is"+a);
	   }
	 @Test (dataProvider = "inputs")
	   public static void sub(int number1, int number2) {
	      int c = number1 - number2;
	      Reporter.log("The difference is"+c);
	   }
	 @Test (dataProvider = "inputs")
	 public static int mul(int number1, int number2) {
	      return number1 * number2;
	   }
	 
	 @Test (dataProvider = "inputs")
	   public static int divInt(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return number1 / number2;
	   }
	 @DataProvider(name="inputs")
		public Object[][] getData() {
			return new Object[][] {
				{1, 25},
				{2, 100},
				{3, 50}
			};
		}
}