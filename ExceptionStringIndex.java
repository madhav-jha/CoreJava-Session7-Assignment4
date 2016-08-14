package session7.assignment4;

public class ExceptionStringIndex {

	public static void main(String[] args) {
		String s = "acadgild";
		
		try {
		System.out.println(s.charAt(8));
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Cannot access character at index 8\n"+e);
		}
		
		System.out.println("Control flow continues...");
	}

}
