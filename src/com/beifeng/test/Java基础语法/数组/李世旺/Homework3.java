package com.beifeng.test.Java基础语法.数组.李世旺;

import java.util.Scanner;

public class Homework3
{
	public static void main(String[] args)
	{
		double[] out = new double[5];
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入本月的消费记录");
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("请输入第%d笔购物的金额:",i+1);
			out[i] = scanner.nextDouble();
			sum += out[i];
		}System.out.printf("序号\t\t金额（元）\t\n");
		for (int i = 0; i < out.length; i++)
		{
			System.out.printf("%d\t\t%f\t\n",i+1,out[i]);
		}
		System.out.println("总金额：\t\t" + sum);
	}
}
