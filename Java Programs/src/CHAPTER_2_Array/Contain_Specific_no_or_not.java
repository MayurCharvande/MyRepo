package CHAPTER_2_Array;

import java.util.Scanner;

public class Contain_Specific_no_or_not 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4]; //Declaration & Memory Allocation
		int l = 0;
		for(int i=0;i<a.length;i++)  // loop to enter No. In array list
		{
			l++;
			System.out.println(l + ". enter no.");
			a[i] = sc.nextInt();
		}
		for(int j=0; j<a.length;j++)
		{
			System.out.println("Enter your no. to find in Array list"); 
			int yourNo = sc.nextInt();
			if(yourNo == a[j])
			{
				System.out.println("Your no. "+a[j]+" is Present in list");
			}
			else
			{
				System.out.println("Your no. "+a[j]+" is NOT Present in list");
			}
			//break;
		}
	}

}
