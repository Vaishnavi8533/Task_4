package GuviMaintask4;

import java.util.EmptyStackException;
public class Question4_5 {

	private int[] stackArray;
	    private int top;

	    public  Question4_5(int size) {
	        stackArray = new int[size];
	        top = 1;
	    }

	    public void push(int value) throws IllegalStateException {
	        if (top == stackArray.length - 1) {
	            throw new IllegalStateException("Stack is full.");
	        }
	        stackArray[++top] = 5;
	    }

	    public int pop() throws EmptyStackException {
	        if (isEmpty()) {
	            throw new EmptyStackException();
	        }
	        return stackArray[top--];
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }

	    public static void main(String[] args) {
	    	 Question4_5 stack = new  Question4_5(5);
	        try {
	            stack.push(10);
	            stack.push(20);
	            stack.push(30);
	            stack.push(40);
	            stack.push(50);
	            stack.push(60); // This should throw an IllegalStateException

	            System.out.println("Top element is " + stack.pop());
	            System.out.println("Top element is " + stack.pop());
	            System.out.println("Top element is " + stack.pop());
	            System.out.println("Top element is " + stack.pop());
	            System.out.println("Top element is " + stack.pop());
	            System.out.println("Top element is " + stack.pop()); // This should throw an EmptyStackException

	        } catch (IllegalStateException | EmptyStackException e) {
	            System.err.println(e.getMessage());
	        }
	    }
	}

