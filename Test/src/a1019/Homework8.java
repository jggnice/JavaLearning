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
		System.out.println("������һ���ַ���:");
		ss = scanner.next();
		System.out.println("������Ҫ���ҵ��ַ�:");
		find = scanner.next().charAt(0);
		char[] sss = ss.toCharArray();
		for (int i = 0; i < sss.length; i++)
		{
			if(sss[i]==find)
				count++;
		}
		
		System.out.println("һ����"+count+ "��'"+ find + "'");
		scanner.close();
	}
}
