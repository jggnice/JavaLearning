package com.beifeng.test.Java�����﷨.����.������;

import java.util.Scanner;

public class Homework1
{
	public static void main(String[] args)
	{
		double[] out = new double[5];
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������5λѧ���ĳɼ�");
		for (int i = 0; i < 5; i++)
		{

			out[i] = scanner.nextDouble();
			sum += out[i];
		}
		System.out.println("ѧ����ƽ���֣�\t\t" + sum / 5);
	}
}
