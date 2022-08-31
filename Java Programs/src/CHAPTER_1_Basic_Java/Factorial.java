package CHAPTER_1_Basic_Java;

import java.util.Scanner;

public class Factorial
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. to find factorial");
	int a=sc.nextInt();
	int f=1;
	for(int i=a;i>=1;i--) 
	{
		f=f*i;
	}
	System.out.println(f);
}
}
