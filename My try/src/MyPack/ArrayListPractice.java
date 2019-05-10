package MyPack;

import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(12);
		arr.add("venki");
		arr.add(1342);
		arr.add('e');
		arr.add(23.4);
		arr.add("venki");
		arr.add("venki");
		arr.add("venki");
		arr.set(1, 200);
		
		String exp="venki";
		int repeat=0;

		for (int i=0;i<=arr.size()-1;i++) {
			
			if(exp.equals(arr.get(i))) {
				repeat++;
			}
			
		}
		System.out.println(repeat);

	}
}
