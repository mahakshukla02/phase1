import java.util.*;
public class Calculate {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		double one =sc.nextDouble();
		double two= sc.nextDouble();
		System.out.println("Enter the operator [+,-,*,/]");
	    char opr=sc.next().charAt(0);
		double result;
		switch(opr) {
		case '+':
			result =one+two;
			break;
			
		case '-':
			result =one-two;
			break;
			
		case '*':
			result =one*two;
			break;
			
		case '/':
			result =one/two;
			break;
			
		default:
			System.err.println("WRONG OPERATION");
			return;
			
		}
		System.out.println( one + " "+ opr +" "+ two +" = "+ result);
	}

}
