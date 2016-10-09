package com.beifeng.test.Java基础语法.数组.李世旺;

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
		System.out.println("数组元素之和："+sum);
		System.out.println("请输入一个数：");
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
			System.out.println("包含");
		}else
		{
			System.out.println("不包含");
		}
		scanner.close();
	}
}
