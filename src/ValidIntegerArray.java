
import java.io.*;
//student name: Weijun Shi
//Id:100408663
//INFO4190

public class ValidIntegerArray{
	
	public static boolean checkElement(String s) {
		  boolean isInteger = false;
		  try {
		   Integer.parseInt(s);
		   // s is a valid integer!
		   isInteger = true;
		  } catch (NumberFormatException e) {
		   //sorry, not an integer
		   // we just move on, but I could have code here
		  }
		  return isInteger;
		}
	
}


