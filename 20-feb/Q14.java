import java.util.Scanner;
class Q14
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=0 ; i<b ; i++)
		{
			a++;
		}
		System.out.print(a);
	}
}