package CHAPTER_1_Basic_Java;

public class Fibonacii 
{
public static void main(String[] args)
{
	int a=0;
	int b=1;
	for(int i=1;i<=10;i++)
	{
		System.out.println(a);
		int r=a+b;
		a=b;
		b=r;
	
	}
}
}
