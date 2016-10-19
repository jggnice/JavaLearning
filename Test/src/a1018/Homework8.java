package a1018;

import java.util.HashMap;


public class Homework8
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
		System.out.println("键集合:"+hashMap.keySet());
		System.out.println("值集合:"+hashMap.values());
		System.out.println("键值对:" + hashMap.entrySet());
		if(hashMap.containsKey("Jack"))
		{
			System.out.print("Jack的姓名:");
			System.out.println(hashMap.get("Jack").name);
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

		@Override
		public String toString()
		{
			return "Student [name=" + name + ", age=" + age + ", sex=" + sex
					+ "]";
		}

		/**
		 * <p align = "center">
		 * <font color = "red"> <i> 覆盖的toString方法 </i> </font>
		 */

	}
}
