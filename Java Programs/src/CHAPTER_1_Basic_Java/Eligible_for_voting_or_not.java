package CHAPTER_1_Basic_Java;
import java.util.*;
public class Eligible_for_voting_or_not {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your age");
	int age = sc.nextInt();
	if(age>18)
		System.out.println("eligible for voting");
	else
		System.out.println("not eligible for voting");
}
}
