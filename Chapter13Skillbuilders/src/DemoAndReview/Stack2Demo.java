package DemoAndReview;


public class Stack2Demo 
{

	public Stack2Demo(int i) {
		// TODO Auto-generated constructor stub
	}
//
	public static void main(String[] args) 
	{
		Stack2Demo s2 = new Stack2Demo(4);
		
		System.out.println("Adding \"red\" and \"yellow \" to stack. ");
		s2.push("red");
		s2.push("yellow");
		System.out.print("Top of stack: "+ s2.top() + "\n");
		System.out.print("Items in stack: "+ s2.size() + "\n");
		System.out.println("Removing top item.");
		s2.pop();
		System.out.print("Top of stack: "+ s2.top());
		System.out.print("Items in stack: "+ s2.size());
		



	}

	private void pop() {
		// TODO Auto-generated method stub
		
	}

	private void push(String string) {
		// TODO Auto-generated method stub
		
	}

	private String size() {
		// TODO Auto-generated method stub
		return null;
	}

	private String top() {
		// TODO Auto-generated method stub
		return null;
	}

}
