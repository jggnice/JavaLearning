package com.beifeng.test.Java�����﷨.����.������;

import java.util.Arrays;

public class Homework10
{
	public static void main(String[] args)

	{
		char[] chs = "qwertyuiop".toCharArray();
		System.out.println("ԭ�ַ�����:");
		for (char c : chs)
		{
			System.out.printf("%c ",c);
		}
		Arrays.sort(chs);
		System.out.println("\n������������:");
		for (char c : chs)
		{
			System.out.printf("%c ",c);
		}
		System.out.println("\nthe index of 'r':"+Arrays.binarySearch(chs, 'r'));
	}
}
