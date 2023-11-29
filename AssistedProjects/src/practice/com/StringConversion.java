package practice.com;

public class StringConversion {

	public static void main(String[] args) {
	
		        String originalString = "Hello, World!";

		        System.out.println("Original String: " + originalString);
		        StringBuffer stringBuffer = new StringBuffer(originalString);

		        System.out.println("StringBuffer: " + stringBuffer);
		        StringBuilder stringBuilder = new StringBuilder(originalString);
		        System.out.println("StringBuilder: " + stringBuilder);
		    }

	}


