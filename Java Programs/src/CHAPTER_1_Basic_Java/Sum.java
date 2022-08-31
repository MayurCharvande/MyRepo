package CHAPTER_1_Basic_Java;
import java.util.*;
public class Sum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers a and press enter");
		int a = sc.nextInt();
		System.out.println("Enter numbers b and press enter");
		int b = sc.nextInt();
		System.out.println("Sum is ="+a+b);
	}

}
