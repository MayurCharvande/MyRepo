package CHAPTER_1_Basic_Java;
import java.util.*;
public class Swapping 
{
    Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();	
public void main1() 
{
	int c;
	System.out.println("SWAPPING WITH 3rd VAR");
	System.out.println("Enter two numbers a & b");
	System.out.println("Numbers before swaping:-"+" "+"a="+a+" "+"b="+b);
	c=a;
	a=b;
	b=c;
	System.out.println("Numbers After swaping:-"+" "+"a="+a+" "+"b="+b);
	
}
public void main2() 
{
	System.out.println("__________________________________________________________");
	System.out.println("SWAPPING WITHOUT 3rd VAR");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Numbers before swaping:-"+" "+"a="+a+" "+"b="+b);
	System.out.println("Numbers After swaping:-"+" "+"a="+a+" "+"b="+b);
}
public static void main(String[] args)
{
	Swapping obj = new Swapping();
	obj.main1();
	obj.main2();
}
}