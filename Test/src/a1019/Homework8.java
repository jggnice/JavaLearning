package a1019;

import java.util.Scanner;

public class Homework8
{
	public static void main(String[] args)
	{
		int count = 0;
		String ss = null;
		char find = 'a';
		Scanner scanner = new Scanner(System.in);		
		System.out.println("请输入一个字符串:");
		ss = scanner.next();
		System.out.println("请输入要查找的字符:");
		find = scanner.next().charAt(0);
		char[] sss = ss.toCharArray();
		for (int i = 0; i < sss.length; i++)
		{
			if(sss[i]==find)
				count++;
		}
		
		System.out.println("一共有"+count+ "个'"+ find + "'");
		scanner.close();
	}
}
