package CHAPTER_1_Basic_Java;

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. to find Table");
	int a=sc.nextInt();
	for(int i=1;i<=10;i++) 
	{
		System.out.println(a+"x"+i+"="+a*i);
	}
}
}
