package com.beifeng.test.Java�����﷨.����.������;

import java.util.Scanner;

public class Homework8
{
	public static void main(String[] args)
	{
		int[] scores =
		{ 16, 25, 9, 90, 23 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("������5��ѧԱ�ĳɼ�:");
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = scanner.nextInt();
		}
		/**
		 * �Ƚ� ������
		 */
		for (int i = 0; i < scores.length - 1; i++)
		{
			/**
			 * �Ƚ� ������
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
		System.out.println("���������ĳɼ�:");
		for (int z : scores)
		{
			System.out.printf("\t%d",z);
		}
	}
}
