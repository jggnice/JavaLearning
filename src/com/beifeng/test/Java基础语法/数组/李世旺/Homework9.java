package com.beifeng.test.Java�����﷨.����.������;

import java.util.Arrays;
import java.util.Scanner;

public class Homework9
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
		
		Arrays.sort(scores);
		System.out.println("���������ĳɼ�:");
		for (int z : scores)
		{
			System.out.printf("\t%d",z);
		}
		System.out.println("\n���������ĳɼ�:");
		for (int i = scores.length - 1; i >= 0; i--)
		{
			System.out.printf("\t%d",scores[i]);
		}
	}
}
