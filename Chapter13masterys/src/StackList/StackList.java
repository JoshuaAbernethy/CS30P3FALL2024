package StackList;

	//Stack implementation using an array
	class Stack {
	 // Maximum size of the stack
	 private static final int MAX_SIZE = 100;
	 
	 // Array to store stack elements
	 private int[] array;
	 
	 // Top of the stack
	 private int top;
	 
	 // Constructor
	 public Stack() {
	     array = new int[MAX_SIZE];
	     top = -1; // Stack is empty when top is -1
	 }
	 
	 // Push an element onto the stack
	 public void push(int x) {
	     // Check if stack is full
	     if (top >= MAX_SIZE - 1) {
	         System.out.println("Stack Overflow! Cannot push " + x);
	         return;
	     }
	     
	     // Increment top and add element
	     array[++top] = x;
	     System.out.println(x + " pushed to stack");
	 }
	 
	 // Pop an element from the stack
	 public int pop() {
	     // Check if stack is empty
	     if (top < 0) {
	         System.out.println("Stack Underflow! Cannot pop element");
	         return Integer.MIN_VALUE;
	     }
	     
	     // Return and remove the top element
	     return array[top--];
	 }
	 
	 // Peek at the top element without removing it
	 public int peek() {
	     // Check if stack is empty
	     if (top < 0) {
	         System.out.println("Stack is empty");
	         return Integer.MIN_VALUE;
	     }
	     
	     // Return top element
	     return array[top];
	 }
	 
	 // Check if stack is empty
	 public boolean isEmpty() {
	     return (top < 0);
	 }
	 
	 // Get the size of the stack
	 public int size() {
	     return top + 1;
	 }
	}

	//Stack implementation using a Linked List
	class StackList {
	 // Inner Node class for the linked list
	 private class Node {
	     Object data;
	     Node next;
	     
	     // Constructor for Node
	     Node(Object d) {
	         data = d;
	         next = null;
	     }
	 }
	 
	 // Top of the stack (head of the linked list)
	 private Node top;
	 
	 // Size of the stack
	 private int size;
	 
	 // Constructor
	 public StackList() {
	     top = null;
	     size = 0;
	 }
	 
	 // Push an element onto the stack
	 public void push(Object x) {
	     // Create a new node
	     Node newNode = new Node(x);
	     
	     // Set the new node's next to current top
	     newNode.next = top;
	     
	     // Update top to be the new node
	     top = newNode;
	     
	     // Increment size
	     size++;
	     
	     System.out.println(x + " pushed to stack");
	 }
	 
	 // Pop an element from the stack
	 public Object pop() {
	     // Check if stack is empty
	     if (isEmpty()) {
	         System.out.println("Stack Underflow! Cannot pop element");
	         return null;
	     }
	     
	     // Store the top element
	     Object popped = top.data;
	     
	     // Move top to next node
	     top = top.next;
	     
	     // Decrement size
	     size--;
	     
	     return popped;
	 }
	 
	 // Peek at the top element without removing it
	 public Object peek() {
	     // Check if stack is empty
	     if (isEmpty()) {
	         System.out.println("Stack is empty");
	         return null;
	     }
	     
	     // Return top element
	     return top.data;
	 }
	 
	 // Check if stack is empty
	 public boolean isEmpty() {
	     return top == null;
	 }
	 
	 // Get the size of the stack
	 public int size() {
	     return size;
	 }
	 
	 // Main method to demonstrate stack operations
	 public static void main(String[] args) {
	     // Demonstrate Stack (array-based)
	     System.out.println("Demonstrating Array-based Stack:");
	     Stack arrayStack = new Stack();
	     arrayStack.push(10);
	     arrayStack.push(20);
	     System.out.println("Top element: " + arrayStack.peek());
	     System.out.println("Popped: " + arrayStack.pop());
	     
	     // Demonstrate StackList (linked list-based)
	     System.out.println("\nDemonstrating Linked List-based Stack:");
	     StackList listStack = new StackList();
	     listStack.push("Hello");
	     listStack.push(42);
	     System.out.println("Top element: " + listStack.peek());
	     System.out.println("Popped: " + listStack.pop());
	 }
	}