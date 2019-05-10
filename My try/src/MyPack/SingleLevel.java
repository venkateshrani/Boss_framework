package MyPack;

public class SingleLevel {

	public static void main(String[] args) {
		SubSingleLevel2 venki=new SubSingleLevel2();
		
		System.out.println( venki.j);
		System.out.println(venki.i);
		venki.demo();
		venki.disp();
		int tesh = venki.j=20;
		System.out.println( tesh);
 	}

}
