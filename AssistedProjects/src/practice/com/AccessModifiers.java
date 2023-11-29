package practice.com;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        MyClass myObject = new MyClass();

		        myObject.publicMethod();    
		        myObject.protectedMethod();
		        myObject.defaultMethod();   
		     
		    }
		}
		class MyClass {
		    public void publicMethod() {
		        System.out.println("Public method");
		    }
		    protected void protectedMethod() {
		        System.out.println("Protected method");
		    }
		    void defaultMethod() {
		        System.out.println("Default method (package-private)");
		    }
		    private void privateMethod() {
		        System.out.println("Private method");

	}

}
