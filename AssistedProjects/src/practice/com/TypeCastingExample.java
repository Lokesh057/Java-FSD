package practice.com;

public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intvalue=10;
		long longvalue = intvalue;
		float floatvalue=longvalue;
		System.out.println("Implicit Type Casting:");
		System.out.println("int value:"+ intvalue);
		System.out.println("long value:"+ longvalue);
		System.out.println("float value:"+ floatvalue);
		double doublevalue = 10.5;
		int intvalueagain = (int)doublevalue;
		System.out.println("Explicit type casting");
		System.out.println("double value:"+ doublevalue);
		System.out.println("int value (after explicit cast): "+intvalueagain);
	}

}
