package com.beifeng.test.Java基础语法.数组.李世旺;

import java.util.Scanner;

public class Homework1
{
	public static void main(String[] args)
	{
		double[] out = new double[5];
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入5位学生的成绩");
		for (int i = 0; i < 5; i++)
		{

			out[i] = scanner.nextDouble();
			sum += out[i];
		}
		System.out.println("学生的平均分：\t\t" + sum / 5);
	}
}
