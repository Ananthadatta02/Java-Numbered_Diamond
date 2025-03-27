package number_patterns;

import java.util.Scanner;

/*
     1
    121
   12321
  1234321
 123454321
12345654321
 123454321
  1234321
   12321
    121
     1
	 */
public class Number_Diamond 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		for(int i=0;i<=n;i++)
		{
			int num = 1;
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(num++);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(num--);
			}
			System.out.println();
		}
		for(int i=0;i<=n;i++)
		{
			int num = 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(num++);
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(num--);
			}
			System.out.println();
		}
	}
}
