package dowhile;

public class doWhile {

	public static void main(String[] args) {
		
		int sum = 0;
		int n=2;
		
		while(n<=1000) {
			sum+=n;
			n+=2;
		}
		
		System.out.println("sum is:"+sum);

	}

}
