package com.beifeng.test.Java�������.A1010;

import java.util.Scanner;

public class Homework7
{
	private static double avg(double[] scores)
	{
		double sum = 0;
		for (int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		return sum / scores.length;
	}

	public static void main(String[] args)
	{
		double[] scores = new double[5];
		System.out.println("������5λѧԱ�ĳɼ�:");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = scanner.nextInt();
		}
		System.out.println("ƽ��ֵ:" + avg(scores));
		System.out.println("��߷�:" + max(scores));
	}

	private static double max(double[] scores)
	{
		double max = 0;
		for (int i = 0; i < scores.length; i++)
		{
			if (scores[i] > max)
				max = scores[i];
		}
		return max;
	}
}
