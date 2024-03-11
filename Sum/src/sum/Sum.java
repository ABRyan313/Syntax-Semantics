package sum;


public class Sum {

	public static void main(String[] args) {
		
		
				
				if(args.length==2) {
					
					try {
						
					
						int start=Integer.parseInt(args[0]);
						int end=Integer.parseInt(args[1]);
						long sum=0;
						
						if(start>end) {
							int temp=start;
							 start=end;
							end=temp;
						}
						

						while(start<=end) {
							sum+=start;
							start+=1;
						}
						
						System.out.println(+sum);
				
					}
					
					catch(Exception ex) {
						System.out.println("Invalid arguments");
					}
					
				}
				
				else {
					System.out.println("Enter Again");
				}
			
			}

	}


