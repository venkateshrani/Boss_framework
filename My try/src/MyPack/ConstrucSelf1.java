package MyPack;

//ConsTructor Chaining using this() and super()

public class ConstrucSelf1 {

	public static void main(String[] args) {
    new Venkat1();
	}

}
class Venkat2{
	Venkat2(){
		System.out.println("Its non argumented");}	
    Venkat2(int arg){
    	this("refer");
		System.out.println("Its int argumented");}
	Venkat2(String arg){
		this('w',23);
		System.out.println("Its String argumented");}	
    Venkat2(char arg,int arg1){
		System.out.println("Its char and int argumented");}	
    Venkat2(char arg,String arg1){
		System.out.println("Its char n String argumented");}	
}
class Venkat1 extends Venkat2
{
	Venkat1(){
	super(23);
	System.out.println("ConsTructor Chaining");
	}
}