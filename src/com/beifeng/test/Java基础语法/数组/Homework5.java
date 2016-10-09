package com.beifeng.test.Java基础语法.数组;

import java.util.Scanner;

public class Homework5
{
	public static void main(String[] args)
	{
		System.out.println("请输入4家手机店的价格:");
		Scanner scanner = new Scanner(System.in);
		double[] prices = new double[4];
		double min = Integer.MAX_VALUE;
		for(int i = 0; i < 4; i++)
		{
			System.out.printf("请输入第%d家店的价格:", i+1);
			prices[i] = scanner.nextDouble();
			if(prices[i] < min)
			{
				min = prices[i];
			}
		}
		System.out.println("最低价格: " + min);
	}
}
