package a1018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework9
{
	public static void main(String[] args)
	{
		List<String> set = new ArrayList<String>();
		String word = "and this test is to show how can we learn collection";
		String[] words = word.split(" ");
		for (int i = 0; i < words.length; i++)
		{
			set.add(words[i]);
		}
		Collections.sort(set);
		System.out.println("���ֵ:");
		System.out.println(Collections.max(set));
		System.out.println("��Сֵ:");
		System.out.println(Collections.min(set));
		System.out.println("��������:");
		Collections.sort(set);
		for (String s: set)
		{
			System.out.println(s);
		}
		System.out.print("-----to���±���:");
		System.out.println(Collections.binarySearch(set, "to"));
		System.out.println();
		System.out.println("��������:");
		Collections.reverse(set);
		for (String s: set)
		{
			System.out.println(s);
		}
		
	}
}
