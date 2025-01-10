package UEmployee;

public class Output extends Faculty {

    // Constructor of Output that calls Faculty's constructor
    public Output(String fn, String ln, double s, String d, String t) {
        super(fn, ln, s, d);
        // The Staff part of Faculty needs a title
        S = new Staff(fn, ln, s, t);
    }

    public void displayUserInfo() {
        // Now that S (Staff) and Faculty are properly set, print the information
        System.out.println("Faculty Department Title: " + getdepartTitle());
        System.out.println("Staff Title: " + S.getTitle());
        System.out.println("First Name: " + getFirstName() + " and Last Name: " + getLastName());
        System.out.println("Salary: " + getSalary() + " dollars.");
    }

    public static void main(String[] args) {
        // Now you create a valid Output object with all parameters
        Output user = new Output("Edward", "Phillips", 50000, "Education", "Professor");
        
        // Call method to display the user information
        user.displayUserInfo();
    }
}//











//package UEmployee;

//public class Output extends Faculty  {

	//public Output(String fn, String ln, double s, String d) {
	//	super(fn, ln, s, d);
	//}

	//Output User = new Output();
	
	//System.out.println("Faculty: " + User.setdepartTitle(d));
	//System.out.println("Staff: " + User.setTitle(t));
	//System.out.println("First Name: " + User.setFirstName(fn) + " and Last Name: " + User.setLastName(ln));
	//System.out.pritnln("Salary: " + User.setSalary(s) + " dollars.");
	
//}
