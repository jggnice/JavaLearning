package com.beifeng.test.Java面向对象.A1010;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Homework4
{
	static List<Student> list = new ArrayList<Student>();
	static boolean search(int start,int end,String name)
	{
		for(int i = start - 1; i < end; i++)
		{
			if(list.get(i).name.equals(name))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++)
		{
			System.out.print("请添加学生姓名:");
			list.add(new Student(scanner.next(),i));
		}
		System.out.println("本班学生列表:");
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next().name + " ");
		}
		System.out.println();
		int st,end;
		String name;
		System.out.println("请输入查找的开始位置:");
		st = scanner.nextInt();
		System.out.println("请输入查找的结束位置:");
		end = scanner.nextInt();
		System.out.println("请输入查找的姓名:");
		name = scanner.next();
		System.out.println("****查找结果*****");
		if(search(st, end, name))
		{
			System.out.println("找到了");
		}
		else
		{
			System.out.println("没有找到!");
		}
		
	}
	static class Student
	{
		String name;
		int id;
		public Student(String name, int id)
		{
			super();
			this.name = name;
			this.id = id;
		}
		public Student()
		{
			super();
			// TODO Auto-generated constructor stub
		}
	}
}
