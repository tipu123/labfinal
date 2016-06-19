package pakg2016;
import java.util.Scanner;
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa = 11;
		int x = 10;
		x = x + 10;
		x = x + 10;
		x = x + 10;
		       double n1, n2;
		        String operation;
		        Scanner scannerObject = new Scanner(System.in);
		        System.out.println("My new work.!!");
		        System.out.println("My new work.tepu");
		        System.out.println("My new work....khan");
		        System.out.println("Enter first number");
		        n1 = scannerObject. nextDouble();
		        System.out.println("Enter second number");
		        n2 = scannerObject. nextDouble();
		        Scanner op = new Scanner(System.in);
		        System.out.println("Enter your operation");
		        operation = op.next();
		
		        switch (operation)  {
		        case "+":
		            System.out.println("Your answer is " + (n1 + n2));
		            break;
		
		        case "-":
		            System.out.println("Your answer is " + (n1 - n2));
		            break;
		
		        case "/":
		            System.out.println("Your answer is " + (n1 / n2));
		            break;
		
		        case "*":
		            System.out.println("Your asnwer is " + (n1 * n2));
		            break;
		
		        default:
		            System.out.println("Kuch v nh huwa G.!");
		
		        }
		    }
		

}
