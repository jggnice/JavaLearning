package com.beifeng.test.Java基础语法.数组.李世旺;

import java.util.Scanner;

public class Homework4
{
	static int scale = 5;
	public static void main(String[] args)
	{
		System.out.println("请输入5位学员的成绩:");
		Scanner scanner = new Scanner(System.in);
		double[] prices = new double[scale];
		//double min = Integer.MAX_VALUE;
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < scale; i++)
		{
			//System.out.printf("请输入第%d家店的价格:", i + 1);
			prices[i] = scanner.nextDouble();
			if (prices[i] > max)
			{
				max = prices[i];
			}
		}
		System.out.println("考试成绩最高分: " + max);
	}
}
