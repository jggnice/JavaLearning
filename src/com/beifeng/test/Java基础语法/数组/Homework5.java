package com.beifeng.test.Java�����﷨.����;

import java.util.Scanner;

public class Homework5
{
	public static void main(String[] args)
	{
		System.out.println("������4���ֻ���ļ۸�:");
		Scanner scanner = new Scanner(System.in);
		double[] prices = new double[4];
		double min = Integer.MAX_VALUE;
		for(int i = 0; i < 4; i++)
		{
			System.out.printf("�������%d�ҵ�ļ۸�:", i+1);
			prices[i] = scanner.nextDouble();
			if(prices[i] < min)
			{
				min = prices[i];
			}
		}
		System.out.println("��ͼ۸�: " + min);
	}
}
