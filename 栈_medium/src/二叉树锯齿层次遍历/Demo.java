package ¶ş²æÊ÷¾â³İ²ã´Î±éÀú;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo 
{
	public static void main(String[] args)
	{
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		
		LinkedList<Integer> newLevel = new LinkedList<Integer>();
		newLevel.add(12);
		results.add(newLevel);
		
		newLevel = new LinkedList<Integer>();
		newLevel.add(2);
		results.add(newLevel);
		
		
		System.out.println(results);
	}

}
