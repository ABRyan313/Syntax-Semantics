package switchCase;
import java.util.*;
public class Weekdays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your day");
		
		String text = sc.nextLine();
		
		switch(text) {
		
		case "1":
			System.out.println("Saturday( Weekend)");
			break;
			
		case "2":
			System.out.println("Sunday(Weekend)");
			break;
			
		case "3":
			System.out.println("Monday");
			break;
			
		case "4":
			System.out.println("Tuesday");
			break;
			
		case "5":
			System.out.println("Wednesday");
			break;
			
		case "6":
			System.out.println("Thursday");
			break;
			
		case "7":
			System.out.println("Friday");
			break;
		}
		

	}

}
