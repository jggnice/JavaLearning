package com.beifeng.test.Java面向对象.A1010;

import java.util.ArrayList;
import java.util.List;

public class Homework6
{
	public static void main(String[] args)
	{
		list.add(new Student("小明", 50));
		list.add(new Student("小旺", 56));
		list.add(new Student("小花", 59));
		modify(list);
	}

	static List<Student> list = new ArrayList<Student>();

	static void modify(List list)
	{
		boolean ff = true;
		while (ff)
		{
			boolean flag = false;
			int i = 0;
			for (; i < list.size(); i++)
			{
				Student s = (Student) list.get(i);
				if (s.score < 60)
				{
					flag = true;
				}
			}
			if ((!flag)&&list.size() == i)
				ff = false;
			if (flag)
			{
				for (Object object : list)
				{
					Student s = (Student) object;
					s.score += 2;
				}
			}
		}
		for (Object object : list)
		{
			Student s = (Student) object;
			System.out.println(s);
		}
		
	}

	static class Student
	{
		String name;
		int score;

		@Override
		public String toString()
		{
			return name + "的成绩是:" + score;
		}

		public Student()
		{
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(String name, int score)
		{
			super();
			this.name = name;
			this.score = score;
		}

	}
}
