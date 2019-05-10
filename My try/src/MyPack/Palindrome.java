package MyPack;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int res,rev=0,temp;
		temp=num;
		
	while(num>0)
	{
	res=num%10;
	rev=(rev*10)+res;
	num=num/10;
	}


	if(temp==rev)
		System.out.println("Its palindrome");
	else
		System.out.println("Its not palindrome");


		
	}

}
