package factorial;
//import java.util.*;
public class Main {
	
	

	public static void main(String[] args) {
		//Scanner in=new Scanner(System.in);
		if (args.length==1) {
			try {
				int n=Integer.parseInt(args[0]);
				//int n=in.nextInt();
				if(n>0)
					System.out.println(factorial(n));
				else {
					System.out.println("Number must be non negative");
					System.exit(0);
				}
			}
			catch(Exception e) {
				System.out.println("Illegal number");
			}
		}
		else {
			System.out.println("Illegal arguements");
			}
		}
		
	private static long factorial(int n) {
		long t = 1;
		for(;n>1;--n)
			t*=n;
		return t;
	}
	
	}


