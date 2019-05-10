package MyPack;

//Its Constructor overloading//i

public class ConstrcSelf {
public static void main(String[] args) {
new Venkat(23);
new Venkat("Venkatesh");
new Venkat('s',"Venkatesh");
}
}
class Venkat{
	
	Venkat(){
		System.out.println("Its non argumented");}	
    Venkat(int arg){
		System.out.println("Its int argumented");}
	Venkat(String arg){
		System.out.println("Its String argumented");}	
    Venkat(char arg,int arg1){
		System.out.println("Its char and int argumented");}	
    Venkat(char arg,String arg1){
		System.out.println("Its char n String argumented");}	
    


	}