
package MyPack;

public class InBuildMethodOfStringClass {

	public static void main(String[] args) {
		String venki="Selenium Coding";
		
		//1.public int length()
		System.out.println(venki.length());
		
		//2.public char charAt(index)
		System.out.println(venki.charAt(8));
		System.out.println(venki.charAt(14));
		
		//3.public int indexOf (string)
		System.out.println(venki.indexOf(" "));
		System.out.println(venki.indexOf("e"));
		System.out.println(venki.indexOf("e",venki.indexOf("e")+1));
		
		//4.public int lastIndexOf (char)
		System.out.println(venki.lastIndexOf('e'));
		System.out.println(venki.lastIndexOf('e',venki.lastIndexOf('e')-1));
		
		//5.public boolean contains(string)
		System.out.println(venki.contains("ng"));
		
		//6.public boolean isEmpty()
		String venki1="";
		System.out.println(venki.isEmpty());
		System.out.println(venki1.isEmpty());
		
		//7.public String toUpperCase(string)
		System.out.println(venki.toUpperCase());
		
		//8.public String toLowerCase(string)
		String venki2="selenium coding";
		System.out.println(venki2.toLowerCase());
		
		//9.public string substring(int)
		System.out.println(venki.substring(2));
		System.out.println(venki.substring(6,12));
		
		//10.public string replace(oldccha,newchar)
		System.out.println(venki.replace('S','K'));
		
		// 11.public string replaceAll(oldccha,newchar)
		String venki4="sesenium Codiseng";
		System.out.println(venki4.replace("se","me"));
		
		//12.public boolean startwith and endwith(string)
		System.out.println(venki.startsWith("Sel"));
		System.out.println(venki.endsWith("ng"));
		
		//13.public String concat(string)
		System.out.println(venki.concat(" is my favourite"));
		
		//14.public string trim()
		String venki5="        selenium    coding        ";
		System.out.println(venki5.trim());
		System.out.println();
		
		//15.public string[] split(string)
		String venki6="Selenium Coding is the best one";
		String[] arr=venki6.split("i");
		for(int i=0;i<=arr.length-1;i++)
		System.out.println(arr[i]);	
		
		//16.public char[] toCharArray()
		char[] arr1=venki6.toCharArray();
		for(int i=0;i<=arr1.length-1;i++)
				
			System.out.print(arr1[i]+"  ");
		
		
		
		
		
		


	}

}
