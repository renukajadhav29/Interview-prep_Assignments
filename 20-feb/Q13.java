import java.util.Scanner;
//13. Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 
class Q13
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int res=0;
		while(a!=0 && b!=0 && c!=0)
		{
			a--;
			b--;
			c--;
			res++;
		}
		
		System.out.print("Smallest Number is : "+res);
		sc.close();
	}
}