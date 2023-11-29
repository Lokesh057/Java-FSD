package practice.com;

public class ArrayaVerification {

	public static void main(String[] args) {
		        int[] integerArray = {1, 2, 3, 4, 5};
		        System.out.print("Integer Array: ");
		        for (int i = 0; i < integerArray.length; i++) {
		            System.out.print(integerArray[i] + " ");
		        }
		        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};
		        System.out.print("String Array: ");
		        for (int i = 0; i < stringArray.length; i++) {
		            System.out.print(stringArray[i] + " ");
		        }
		        System.out.println(); 
		        
		        double[] doubleArray = new double[4];
		        doubleArray[0] = 1.5;
		        doubleArray[1] = 2.6;
		        doubleArray[2] = 3.4;
		        doubleArray[3] = 4.1;

		        // Displaying elements of the double array
		        System.out.print("Double Array: ");
		        for (int i = 0; i < doubleArray.length; i++) {
		            System.out.print(doubleArray[i] + " ");
		        }
		        System.out.println();

	}

}
