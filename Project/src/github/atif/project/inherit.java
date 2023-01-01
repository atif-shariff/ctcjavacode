package github.atif.project;

public class inherit {
		  private String fname = "atif";
		  private String lname = "shariff";
		  private String email = "atifs.com";
		  private int age = 21;
		  
		  public static void main(String[] args) {
		    inherit myObj = new inherit();
		    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		    System.out.println("Email: " + myObj.email);
		    System.out.println("Age: " + myObj.age);
		  }
}
