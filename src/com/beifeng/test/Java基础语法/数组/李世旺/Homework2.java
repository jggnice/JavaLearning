package com.beifeng.test.Java�����﷨.����.������;

import java.util.Scanner;

public class Homework2
{
	public static void main(String[] args)
	{
		int sum = 0;
		boolean b = false;
		int [] scores = {8,4,2,1,23,344,12};
		Scanner scanner = new Scanner(System.in);
		for(int z : scores){
			System.out.println(z);
			sum += z;
		}
		System.out.println("����Ԫ��֮�ͣ�"+sum);
		System.out.println("������һ������");
		int value = scanner.nextInt();
		for (int i = 0; i < scores.length; i++)
		{
			if(value == scores[i])
			{
				b = true;
				break;
			}
		}
		if(b)
		{
			System.out.println("����");
		}else
		{
			System.out.println("������");
		}
		scanner.close();
	}
}
