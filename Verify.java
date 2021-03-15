import java.lang.String;
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;


public class Verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> email=new ArrayList<String>();
		email.add("user@domain.com");
		email.add("user@domain.co.in");
		email.add("user12@domain.com");
		email.add("user.name@domain.co.in");
		email.add("user#@domain.com");
		email.add("user@domaincom");
		System.out.println("Enter the email you are searching for:");
		String search =sc.next();
		Verify v= new Verify();
		v.containsIgnoreCase(search,email);
	}	
	public static void containsIgnoreCase(String search,ArrayList<String>email)
	{
		//System.out.print("Enter the email you are searching for:");
		for(String e :email) {
			if(e.equalsIgnoreCase(search)) {
				System.out.println(search + "  is present in the array of emails");
				
			}
			
		}
	}
		

}
