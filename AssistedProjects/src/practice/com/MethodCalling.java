package practice.com;

public class MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExampleClass exampleObject = new ExampleClass();

	        exampleObject.simpleMethod(); 
	        exampleObject.methodWithParameters(5, "Hello"); 
	        int sumResult = exampleObject.sum(3, 4);
	        System.out.println("Sum result: " + sumResult);
	        int multipliedResult = exampleObject.multiply(2, 3) * 5;
	        System.out.println("Multiplied result: " + multipliedResult);
	        exampleObject.overloadedMethod(10); // Calls the first overloaded method
	        exampleObject.overloadedMethod("Overloaded"); // Calls the second overloaded method
	    }
	}

	class ExampleClass {
	    
	    public void simpleMethod() {
	        System.out.println("Simple method called");
	    }

	    
	    public void methodWithParameters(int number, String text) {
	        System.out.println("Method with parameters called. Number: " + number + ", Text: " + text);
	    }

	    public int sum(int a, int b) {
	        return a + b;
	    }
	    public int multiply(int a, int b) {
	        return a * b;
	    }
	    public void overloadedMethod(int number) {
	        System.out.println("Overloaded method with int parameter called. Number: " + number);
	    }

	    public void overloadedMethod(String text) {
	        System.out.println("Overloaded method with String parameter called. Text: " + text);
	}

}
