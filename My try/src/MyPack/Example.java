package MyPack;

public class Example {

	public static void main(String[] args) {
		Try1.myMethod();
		Try1 venki = new Try1();
		venki.myMethod(100,200);
		
	}

}
 class Try1
{
	 static void myMethod() {
		System.out.println("Nothing");
	}
	 void myMethod(int i,int j) {
			System.out.println("Everything");
		}
}