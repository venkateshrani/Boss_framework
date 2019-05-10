package MyPack;

public class Abstraction {
public static void main(String[] args) {
		Sample2 ref = new Sample2(35);
		ref.muthuKumar();
		System.out.println(Sample2.i);
	}}
abstract class Sample1{
	
	void venki(){
     System.out.println("its venki with concrete");
	}
	abstract void muthuKumar();
}
class Sample2 extends Sample1{
	
	Sample2(int ht){
		System.out.println(ht);
	}
	static int i=100;
	
	void muthuKumar() {
		System.out.println("Muthukumar is in changed as concrete");
	}}
abstract class Sample3 extends Sample1{
	
	void asu() {
		System.out.println("Asu is in changed as concrete");
	}}