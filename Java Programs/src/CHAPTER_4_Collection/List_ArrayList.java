package CHAPTER_4_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*add()--> Adding element
  get()-->fetch element
  set()-->change element
  sort()--> sort all elements Automatically
 */
public class List_ArrayList 
{
	Scanner sc = new Scanner(System.in);
/*BASIC PROBLEM IN ARRAYLIST*/
	public void Demo1() 
	{
		System.out.println("Enter your Name \n age \n roll \n grade");
		String name = sc.nextLine();
		int age = sc.nextInt();
		int roll = sc.nextInt();
		float grade = sc.nextFloat();
		
		ArrayList obj = new ArrayList(); //Creating ArrayList
		obj.add(name);                   // Adding object in ArrayList
		obj.add(age);
		obj.add(roll);
		obj.add(grade);
		
		for(int i=0; i<4 ;i++)           //Traversing list through For loop
		{
			System.out.println(obj.get(i));	//get() method to fetch element
		}
	}
/*SET & GET METHODS IN ARRAYLIST*/
	public void Demo2()
	{
		System.out.println("===============================================");
		/*Syntax:  ArrayList<datatype> object = new ArrayList<datatype>)();*/
		ArrayList<String> obj2 = new ArrayList<String>();
		obj2.add("a");
		obj2.add("b");
		obj2.add("c");
		
		System.out.println("this element we wanted to change--->"+obj2.get(1)); //accessing Elements
		
		obj2.set(1, "*"); //Changing the Element
		System.out.println("List after changing the elements---->");
		for(int i=0;i<3;i++) //Traversing (to visit at that element) through for loop 
		{
			System.out.println(obj2.get(i));
		}
		System.out.println("==================================================");
	}
/*SORT ARRAYLIST EXAMPLE*/
	public void Demo3()
	{
		/*sorting string*/
		List<String> obj3 = new ArrayList<String>(); //creating list
		obj3.add("Banana");
		obj3.add("Apple");
		obj3.add("Chikku");
		
		Collections.sort(obj3); //to sort the list
		
		for(int i=0;i<3;i++)
		{
			System.out.println("After sorting"+obj3.get(i));
		}
		System.out.println("==================================================");
		/*sorthing numbers*/
		List<Integer> obj4 = new ArrayList<Integer>();
		obj4.add(4);
		obj4.add(3);
		obj4.add(2);
		obj4.add(1);
		Collections.sort(obj4);
		for(int i =0;i<4;i++)
		{
			System.out.println("After sorting"+obj4.get(i));
		}
	}
	
public static void main(String[] args)
{
	List_ArrayList object = new List_ArrayList ();
	object.Demo1();		
	object.Demo2();
	object.Demo3();
}
}
