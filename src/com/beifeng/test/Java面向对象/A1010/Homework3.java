package com.beifeng.test.Java面向对象.A1010;

import java.util.Scanner;

public class Homework3
{
	
public static void main(String[] args)
{
	String fruit = null;
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入一种水果:");
	fruit = scanner.next();
	zhazhiji(fruit);
}

private static void zhazhiji(String fruit)
{
	// TODO Auto-generated method stub
	System.out.println(fruit + "汁");
}
}
