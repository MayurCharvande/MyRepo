package CHAPTER_2_Array;

import java.util.Scanner;

public class Sum_Average 
{

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	               
	int a[]= new int[3];  /*Declaration & Memory Allocation*/
	
		int sum=0;
		for(int i=0;i<a.length;i++) /*first loop to Initialization of Array*/
		{	
			a[i] = sc.nextInt(); /*Initialization*/
		}
		for(int j=0;j<a.length;j++) /*Second loop to perform operation*/
		{
			sum = sum + a[j]; 
		}
		int avg = sum/(a.length);
		System.out.println("Sum is = "+sum);
		System.out.println("Avg is = " + avg);
	}

}
