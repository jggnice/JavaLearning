package com.beifeng.test.Java面向对象.A1009;

import java.util.Scanner;

public class Homework1
{

	public static void main(String[] args)
	{
		int[][] cl = new int[3][5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < cl.length; i++)
		{
			System.out.printf("*****第%d个班级的成绩\n", i + 1);
			for (int j = 0; j < cl[i].length; j++)
			{
				System.out.printf("请输入第%d个学生的成绩:", j + 1);
				cl[i][j] = scanner.nextInt();
			}

		}
		System.out.println("*******成绩统计");
		for (int i = 0; i < cl.length; i++)
		{
			
			System.out.printf("%d班总成绩:%d\n", i + 1, sum(cl[i]));
		}
	}

	private static int sum(int[] a)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}
		return sum;
	}

}
