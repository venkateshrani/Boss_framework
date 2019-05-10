package MyPack;

public class YoutubeAbstraction {

	public static void main(String[] args) {
		Venki dev = new Venki1();
           
              dev.muthu();
              System.out.println(dev.muthu());

	}

}
abstract class Venki {
	Venki(){
		System.out.println("Its constructor");
	}
	String muthu(){
		System.out.println("Yeah its me");
	return "Muthukumar";
		}
	abstract void muthu1();
	abstract void muthu2();
}
class Venki1 extends Venki{
	void muthu3() {
		System.out.println("This is not my method");
	}

	@Override
	void muthu1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void muthu2() {
		// TODO Auto-generated method stub
		
	}
}
