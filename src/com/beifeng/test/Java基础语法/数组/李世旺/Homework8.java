package com.beifeng.test.Java基础语法.数组.李世旺;

import java.util.Scanner;

public class Homework8
{
	public static void main(String[] args)
	{
		int[] scores =
		{ 16, 25, 9, 90, 23 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入5名学员的成绩:");
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = scanner.nextInt();
		}
		/**
		 * 比较 多少轮
		 */
		for (int i = 0; i < scores.length - 1; i++)
		{
			/**
			 * 比较 到哪里
			 */
			for (int j = 0; j < scores.length - 1 - i; j++)
			{
				if (scores[j] < scores[j + 1])
				{
					int tep = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = tep;
				}
			}
		}
		System.out.println("降序排序后的成绩:");
		for (int z : scores)
		{
			System.out.printf("\t%d",z);
		}
	}
}
