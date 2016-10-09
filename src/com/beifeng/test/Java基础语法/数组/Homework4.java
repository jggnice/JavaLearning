package com.beifeng.test.Java基础语法.数组;

import java.util.Scanner;

public class Homework4
{
	public static void main(String[] args)
	{
		int[] s =
		{ 99, 85, 82, 63, 60, 0 };
		System.out.println("排序前的成绩数组:");
		for(int z : s)
		{
			System.out.printf("%d\t",z);
		}
		System.out.println("\n请插入一个成绩:");
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
		System.out.println("插入位置下标为:" + cur);
		for (int i = s.length - 1; i > cur; i--)
		{
			s[i] = s[i-1];
		}
		s[cur] = tep;
		
		System.out.println("排序后的成绩数组:");
		for(int z : s)
		{
			System.out.printf("%d\t",z);
		}
	}
}
