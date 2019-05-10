package MyPack;

public class ThreeObjects {
        public static void main(String[] args) {
		System.out.println(Calculator.cal1);
		System.out.println(Calculator.cal2);
		System.out.println(Calculator.cal3);
		System.out.println(Calculator.cal4);
}}
class Calculator{
	final static Calculator cal1 = new Calculator();
	final static Calculator cal2 = new Calculator();
	final static Calculator cal3 = new Calculator();
	final static Calculator cal4 = new Calculator();
	private Calculator() {
		System.out.println("Calculator");
}}