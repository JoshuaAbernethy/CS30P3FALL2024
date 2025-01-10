package StackList;

	
	class Stack {

	 private static final int MAX_SIZE = 100;
	 

	 private int[] array;
	 
	//
	 private int top;
	 

	 public Stack() {
	     array = new int[MAX_SIZE];
	     top = -1; // Stack is empty when top is -1
	 }
	 
	
	 public void push(int x) {
	     // Check if stack is full
	     if (top >= MAX_SIZE - 1) {
	         System.out.println("Stack Overflow! Cannot push " + x);
	         return;
	     }
	     

	     array[++top] = x;
	     System.out.println(x + " pushed to stack");
	 }
	 

	 public int pop() {
	
	     if (top < 0) {
	         System.out.println("Stack Underflow! Cannot pop element");
	         return Integer.MIN_VALUE;
	     }
	     

	     return array[top--];
	 }
	 
	
	 public int peek() {

	     if (top < 0) {
	         System.out.println("Stack is empty");
	         return Integer.MIN_VALUE;
	     }

	     return array[top];
	 }
	 
	
	 public boolean isEmpty() {
	     return (top < 0);
	 }
	 

	 public int size() {
	     return top + 1;
	 }
	}


	class StackList {

	 private class Node {
	     Object data;
	     Node next;
	     

	     Node(Object d) {
	         data = d;
	         next = null;
	     }
	 }
	 

	 private Node top;
	 

	 private int size;
	 

	 public StackList() {
	     top = null;
	     size = 0;
	 }
	 

	 public void push(Object x) {

	     Node newNode = new Node(x);
	     

	     newNode.next = top;

	     top = newNode;
	     

	     size++;
	     
	     System.out.println(x + " pushed to stack");
	 }
	 

	 public Object pop() {

	     if (isEmpty()) {
	         System.out.println("Stack Underflow! Cannot pop element");
	         return null;
	     }
	     

	     Object popped = top.data;
	     

	     top = top.next;
	     

	     size--;
	     
	     return popped;
	 }
	 

	 public Object peek() {

	     if (isEmpty()) {
	         System.out.println("Stack is empty");
	         return null;
	     }
	     

	     return top.data;
	 }
	 

	 public boolean isEmpty() {
	     return top == null;
	 }
	 
	 public int size() {
	     return size;
	 }
	 

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