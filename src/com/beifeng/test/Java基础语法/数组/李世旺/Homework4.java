package com.beifeng.test.Java�����﷨.����.������;

import java.util.Scanner;

public class Homework4
{
	static int scale = 5;
	public static void main(String[] args)
	{
		System.out.println("������5λѧԱ�ĳɼ�:");
		Scanner scanner = new Scanner(System.in);
		double[] prices = new double[scale];
		//double min = Integer.MAX_VALUE;
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < scale; i++)
		{
			//System.out.printf("�������%d�ҵ�ļ۸�:", i + 1);
			prices[i] = scanner.nextDouble();
			if (prices[i] > max)
			{
				max = prices[i];
			}
		}
		System.out.println("���Գɼ���߷�: " + max);
	}
}
