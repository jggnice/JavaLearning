package com.beifeng.test.Java基础语法.数组.李世旺;

import java.util.Arrays;

public class Homework10
{
	public static void main(String[] args)

	{
		char[] chs = "qwertyuiop".toCharArray();
		System.out.println("原字符序列:");
		for (char c : chs)
		{
			System.out.printf("%c ",c);
		}
		Arrays.sort(chs);
		System.out.println("\n升序排序序列:");
		for (char c : chs)
		{
			System.out.printf("%c ",c);
		}
		System.out.println("\nthe index of 'r':"+Arrays.binarySearch(chs, 'r'));
	}
}
