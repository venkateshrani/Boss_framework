package MyPack;


 abstract class SubAbstr {
void disp(){
	System.out.println("Disp in sample 1");
}
abstract void demo();
}
 class Sample extends SubAbstr
{
	void demo()
	{
		System.out.println("hai");
	}
	
	}
class SubAbstraction{
	public static void main(String[] args) {
		SubAbstr sub=new Sample();
		sub.demo();
	}
		
	}
