package CHAPTER_1_Basic_Java;

import java.util.Scanner;

public class SwitchCase 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice between 1 to 7");
	int choice = sc.nextInt();
	switch(choice)
	{
		case 1:
			System.out.println("M");
			break;
		case 2:
			System.out.println("T");
			break;
		case 3:
			System.out.println("W");
			break;
		case 4:
			System.out.println("Th");
			break;
		case 5:
			System.out.println("F");
			break;
		case 6:
			System.out.println("S");
			break;
		case 7:
			System.out.println("Sun");
			break;
	}
}
}
