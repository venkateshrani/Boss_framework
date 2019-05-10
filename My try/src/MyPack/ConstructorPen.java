package MyPack;
public class ConstructorPen {
//*declare non static,every class,compiler-default,if prog,class name=cons,not final,static,abstr,void,	
	public static void main(String[] args) {
	Login p1=new Login("Venki",908987322,23);	
	p1.color();

	}

}
class Login{
	String name;
	long phno;
	int id;
	
	
	Login(String name,long phno,int id){
		this.name=name;
		this.phno=phno;
		this.id=id;
		System.out.println(name+" "+phno+" "+id);
	}
	void color() {
		System.out.println("The Username is "+ name);
		System.out.println("Phone no is "+ phno);
		System.out.println("The ID is "+ id);
	}
	
}