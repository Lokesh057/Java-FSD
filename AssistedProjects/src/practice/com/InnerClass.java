package practice.com;

public class InnerClass {

		    public class NonStaticInnerClass {
		        // Member variable in the non-static inner class
		        private String innerVariable = "Inner Variable";

		        public void displayInner() {
		            System.out.println("Non-Static Inner Class Method: " + innerVariable);
		        }
		    }

		   
		    public static class StaticNestedClass {
		        private String staticNestedVariable = "Static Nested Variable";
		        public void displayStaticNested() {
		            System.out.println("Static Nested Class Method: " + staticNestedVariable);
		        }
		    }
		    public void demonstrateLocalClass() {
		        class LocalClass {
		            private String localVariable = "Local Variable";
		            public void displayLocal() {
		                System.out.println("Local Class Method: " + localVariable);
		            }
		        }
		        LocalClass localObject = new LocalClass();
		        localObject.displayLocal();
		    }

		    public static void main(String[] args, NonStaticInnerClass innerObject) {
		        // Creating an instance of the outer class
		        InnerClass InnerClassouterObject = new InnerClass();
		        InnerClass.StaticNestedClass staticNestedObject = new InnerClass.StaticNestedClass();
		        innerObject.displayInner();
		        staticNestedObject.displayStaticNested();

		        InnerClass outerObject = null;
				// Calling the method with a local class
		        ((InnerClass) outerObject).demonstrateLocalClass();

	}

}
