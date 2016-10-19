package a1019;

import java.util.Scanner;

public class Homework9
{
	public static void main(String[] args)
	{
		System.out.println("ÇëÊäÈëÒ»´®Êý×Ö:");
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		StringBuffer buffer = new StringBuffer(next);
		for (int i = buffer.length() - 3; i > 0; i -= 3)
		{
			buffer.insert(i, ",");
		}
		System.out.println(buffer);
		scanner.close();
	}
}
