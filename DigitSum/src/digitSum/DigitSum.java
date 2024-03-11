package digitSum;
import java.util.*;

public class DigitSum {

	public static void main(String[] args) {
		//if (args.length==1) {
			Scanner sc=new Scanner(System.in);
			try {
				//int n=Integer.parseInt(args[0]);
				int n=sc.nextInt();
				sc.close();
				if(n>0) {
				System.out.println(Digitsum(n));
				}
				else {
					System.out.println("number must be non negative");
				}
			
				System.exit(0);
			}
			catch(Exception e) {
				System.out.println("Enter again");
				
			}
			
		}
		//else {
			//System.out.println("Invalid arguement!");
		//}

	
	
	private static long Digitsum(long t) {
		for(;t>9;) {
			long s=0;
			for(;t>0;s=s+(t%10),t=t/10);
			t=s;
		}
		return (int)t;
		
	}

}
