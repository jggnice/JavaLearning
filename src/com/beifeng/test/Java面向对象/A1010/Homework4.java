package com.beifeng.test.Java�������.A1010;

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
			System.out.print("�����ѧ������:");
			list.add(new Student(scanner.next(),i));
		}
		System.out.println("����ѧ���б�:");
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next().name + " ");
		}
		System.out.println();
		int st,end;
		String name;
		System.out.println("��������ҵĿ�ʼλ��:");
		st = scanner.nextInt();
		System.out.println("��������ҵĽ���λ��:");
		end = scanner.nextInt();
		System.out.println("��������ҵ�����:");
		name = scanner.next();
		System.out.println("****���ҽ��*****");
		if(search(st, end, name))
		{
			System.out.println("�ҵ���");
		}
		else
		{
			System.out.println("û���ҵ�!");
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
