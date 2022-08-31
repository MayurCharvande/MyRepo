package CHAPTER_1_Basic_Java;

public class Divisible_or_Not {
public static void main(String[] args) {
	for(int i=1;i<=100;i++) 
	{
		if(i%3==0)
			System.out.println(i+" "+"divisible by 3");
		if(i%5==0)
			System.out.println(i+" "+"divisible by 5");
		if(i%3==0 && i%5==0)
			System.out.println(i+" "+"by both");
	}
}
}
