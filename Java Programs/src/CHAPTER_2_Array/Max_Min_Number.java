package CHAPTER_2_Array;

import java.util.Scanner;

public class Max_Min_Number
{
	Scanner sc = new Scanner(System.in);
	int a[] = new int[4];
	
	public void Initialization()
	{
		for(int k =0;k<4;k++)
		{
			System.out.println("Enter Number");
			a[k] = sc.nextInt();
		}
	}
	public void Min()
	{
		for(int i=0;i<a.length;i++)
		{
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[j]<a[i])
			 {
				 int temp = a[i];
				 	  a[i]=a[j];
				 	  a[j]=temp;
			 }
		 }
		 System.out.print(a[i]);
		//break;
		} 
	}

	public static void main(String[] args) 
	{
		Max_Min_Number obj = new Max_Min_Number();
		obj.Initialization();
		obj.Min();
	}
}
