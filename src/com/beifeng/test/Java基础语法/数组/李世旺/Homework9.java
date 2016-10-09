package com.beifeng.test.Java基础语法.数组.李世旺;

import java.util.Arrays;
import java.util.Scanner;

public class Homework9
{
	public static void main(String[] args)
	{
		int[] scores =
		{ 16, 25, 9, 90, 23 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入5名学员的成绩:");
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = scanner.nextInt();
		}
		
		Arrays.sort(scores);
		System.out.println("升序排序后的成绩:");
		for (int z : scores)
		{
			System.out.printf("\t%d",z);
		}
		System.out.println("\n降序排序后的成绩:");
		for (int i = scores.length - 1; i >= 0; i--)
		{
			System.out.printf("\t%d",scores[i]);
		}
	}
}
