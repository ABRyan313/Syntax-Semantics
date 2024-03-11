package sum.java;

public class sum {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Error");
		}
		
		
		try {
			int Start=Integer.parseInt(args[0]);
			int End=Integer.parseInt(args[1]);
			
			if(Start>End) {
				int temp=Start;
				Start=End;
				End=temp;
			}
			
			long sum=0;
			while(Start<=End) {
				sum+=Start;
				Start+=1;
			}
			
			System.out.println("Sum is:"+sum);
		}
		
		catch(Exception e) {
			System.out.println("Error");
		}

	}

}
