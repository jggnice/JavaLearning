package com.beifeng.test.Java�������.A1009;

import java.util.Scanner;

public class Homework1
{

	public static void main(String[] args)
	{
		int[][] cl = new int[3][5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < cl.length; i++)
		{
			System.out.printf("*****��%d���༶�ĳɼ�\n", i + 1);
			for (int j = 0; j < cl[i].length; j++)
			{
				System.out.printf("�������%d��ѧ���ĳɼ�:", j + 1);
				cl[i][j] = scanner.nextInt();
			}

		}
		System.out.println("*******�ɼ�ͳ��");
		for (int i = 0; i < cl.length; i++)
		{
			
			System.out.printf("%d���ܳɼ�:%d\n", i + 1, sum(cl[i]));
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
