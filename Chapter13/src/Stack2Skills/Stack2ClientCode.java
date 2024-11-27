package Stack2Skills;

public class Stack2ClientCode {
    public static void main(String[] args) {
        // Create a Stack2 object with a maximum capacity of 5 items
        Stack2 stack = new Stack2(5);

        // Push some objects onto the stack
        stack.push("Hello, world!");  // String object
        stack.push(42);               // Integer object
        stack.push(3.14);             // Double object

        // Peek at the top of the stack
        System.out.println("Top of the stack: " + stack.top());  // Should print 3.14

        // Pop and print the elements from the stack
        System.out.println("Popped: " + stack.pop()); // Should print 3.14
        System.out.println("Popped: " + stack.pop()); // Should print 42
        System.out.println("Popped: " + stack.pop()); // Should print Hello, world!

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Should print true

        // Push more items to test the stack's behavior
        stack.push("New Item");  // String object
        stack.push(100);         // Integer object

        // Print the size of the stack
        System.out.println("Current stack size: " + stack.size()); // Should print 2

        // Peek at the top item again
        System.out.println("Top of the stack: " + stack.top()); // Should print 100

        // Make the stack empty
        stack.makeEmpty();
        System.out.println("Stack emptied.");

        // Check if the stack is empty after calling makeEmpty
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Should print true
    }
}