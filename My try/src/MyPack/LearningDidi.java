package MyPack;

import java.util.Scanner;
public class LearningDidi 
{
public static void main(String[] args)
{
		//Another way of initialize the value from console 
		int[]venki=new int[5];
        //scanner syntax
		Scanner sc=new Scanner(System.in);
	{		
		//loop for asking value from console
		 for(int i=0;i<=venki.length-1;i++)
		 venki[i]=sc.nextInt();//this is the way to ask value
	}
		 for(int i=0;i<=venki.length-1;i++)
			System.out.println(venki[i]);
}
}
