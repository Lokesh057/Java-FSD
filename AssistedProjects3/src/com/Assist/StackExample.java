package com.Assist;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {

		        Stack<Integer> stack = new Stack<>();

		        // Insert elements into the stack (push)
		        pushElements(stack, 10);
		        pushElements(stack, 20);
		        pushElements(stack, 30);

		        // Display the elements in the stack
		        System.out.println("Stack after pushing elements: " + stack);

		        // Remove elements from the stack (pop)
		        popElements(stack);
		        popElements(stack);

		        // Display the elements in the stack after popping
		        System.out.println("Stack after popping elements: " + stack);
		    }

		    // Method to insert elements into the stack (push)
		    private static void pushElements(Stack<Integer> stack, int element) {
		        System.out.println("Pushing element: " + element);
		        stack.push(element);
		    }

		    // Method to remove elements from the stack (pop)
		    private static void popElements(Stack<Integer> stack) {
		        if (stack.isEmpty()) {
		            System.out.println("Stack is empty. Cannot pop.");
		        } else {
		            int poppedElement = stack.pop();
		            System.out.println("Popped element: " + poppedElement);
		        }
		    }
		

}
