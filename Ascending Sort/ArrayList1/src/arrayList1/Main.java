package arrayList1;
import java.util.*; 

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Jarvis");
		list.add("PointBreak");
		list.add("StarLord");
		list.add("Rocket");
		list.add("Nebula");
		
		System.out.println(list.get(4));
		list.set(4, "AB");
		
		
		for(String s: list)
			System.out.println(s);

	}

}
