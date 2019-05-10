package MyPack;

public class InheritanceTry {

	public static void main(String[] args) {
		SubClass2 ref1=new SubClass2();
		ref1.demo();
		ref1.disp();
		ref1.sape();
		System.out.println(ref1.str);
		System.out.println(ref1.phno);
		System.out.println(ref1.grade);
		
	}

}
class SuperClass{
	String str="VENKI";
	void demo() {
		System.out.println("This is Superclass");
	}
}
class SubClass1 extends SuperClass{
	long phno=959766894;
	void disp() {
		System.out.println("This is Subclass 1");
	}
}
class SubClass2 extends SubClass1{
	char grade='A';
	void sape() {
		System.out.println("This is Subclass 2");
	}
}