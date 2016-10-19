package a1018;

import java.util.HashMap;

public class Homework7
{
	public static void main(String[] args)
	{
		HashMap<String, Student> hashMap = new HashMap<String, Student>();
		Student[] st =
		{ new Student("小明", 10, "男", "Jack"),
				new Student("小胡", 20, "女", "Tom"),
				new Student("小花", 21, "女", "Jenifer") };
		for (int i = 0; i < st.length; i++)
		{
			hashMap.put(st[i].favour, st[i]);
		}
//		for (Object o : hashMap.keySet())
//		{
//			Student tep = hashMap.get(o);
//			System.out.print(tep.favour + ":");
//			System.out.println(tep);
//		}
		if(hashMap.containsKey("Jack"))
		{
			System.out.print("Jack:");
			System.out.println(hashMap.get("Jack"));
		}
		

	}

	static class Student
	{
		String name;
		int age;
		String sex;
		String favour;

		public Student(String name, String favour)
		{
			super();
			this.name = name;
			this.favour = favour;
		}

		public Student(String name, int age, String sex, String favour)
		{
			super();
			this.name = name;
			this.age = age;
			this.sex = sex;
			this.favour = favour;
		}

		public Student()
		{
			super();
		}

		/**
		 * <p align = "center">
		 * <font color = "red"> <i> 覆盖的toString方法 </i> </font>
		 */
		@Override
		public String toString()
		{
			return "这个同学的名字是：" + name + "\n年龄是：" + age + "\n性别是" + sex

			+ "\n英文名字是：" + favour;
		}

	}
}
