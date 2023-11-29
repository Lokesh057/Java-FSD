package practice.com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpressions {

	public static void main(String[] args) {
		        String input = "Hello123";
		        String pattern = "^[a-zA-Z]+$"; 

		        if (isValidPattern(input, pattern)) {
		            System.out.println("Input '" + input + "' Matches the pattern.");
		        } else {
		            System.out.println("Input '" + input + "' does not match the pattern.");
		        }
		    }
		    private static boolean isValidPattern(String input, String pattern) {
		        Pattern regex = Pattern.compile(pattern);
		        Matcher matcher = regex.matcher(input);
		        return matcher.matches();

	}

}
