package CHAPTER_1_Basic_Java;

import java.util.Scanner;

public class Leap_Year
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Year to Check Leap Year");
	int year=sc.nextInt();
	if(((year%4==0)&&(year%100!=0))||(year%400==0)) 
	{
		System.out.println(year+" "+"is Leap Year");
	}
	else 
	{
		System.out.println(year+" "+"is not a Leap Year");
	}
}
}
