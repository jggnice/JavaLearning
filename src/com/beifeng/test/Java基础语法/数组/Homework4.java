package com.beifeng.test.Java�����﷨.����;

import java.util.Scanner;

public class Homework4
{
	public static void main(String[] args)
	{
		int[] s =
		{ 99, 85, 82, 63, 60, 0 };
		System.out.println("����ǰ�ĳɼ�����:");
		for(int z : s)
		{
			System.out.printf("%d\t",z);
		}
		System.out.println("\n�����һ���ɼ�:");
		Scanner scanner = new Scanner(System.in);
		int tep = scanner.nextInt();
		int cur = 0;
		for (int i = 0; i < s.length; i++)
		{
			if (tep > s[i])
			{
				cur = i;
				break;
			}
		}
		System.out.println("����λ���±�Ϊ:" + cur);
		for (int i = s.length - 1; i > cur; i--)
		{
			s[i] = s[i-1];
		}
		s[cur] = tep;
		
		System.out.println("�����ĳɼ�����:");
		for(int z : s)
		{
			System.out.printf("%d\t",z);
		}
	}
}
