package com.beifeng.test.Java�����﷨.����.������;

import java.util.Scanner;

public class Homework3
{
	public static void main(String[] args)
	{
		double[] out = new double[5];
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����뱾�µ����Ѽ�¼");
		for (int i = 0; i < 5; i++)
		{
			System.out.printf("�������%d�ʹ���Ľ��:",i+1);
			out[i] = scanner.nextDouble();
			sum += out[i];
		}System.out.printf("���\t\t��Ԫ��\t\n");
		for (int i = 0; i < out.length; i++)
		{
			System.out.printf("%d\t\t%f\t\n",i+1,out[i]);
		}
		System.out.println("�ܽ�\t\t" + sum);
	}
}
