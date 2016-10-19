package a1018;

import java.util.HashMap;


public class Homework8
{
	public static void main(String[] args)
	{
		HashMap<String, Student> hashMap = new HashMap<String, Student>();
		Student[] st =
		{ new Student("С��", 10, "��", "Jack"),
				new Student("С��", 20, "Ů", "Tom"),
				new Student("С��", 21, "Ů", "Jenifer") };
		for (int i = 0; i < st.length; i++)
		{
			hashMap.put(st[i].favour, st[i]);
		}
		System.out.println("������:"+hashMap.keySet());
		System.out.println("ֵ����:"+hashMap.values());
		System.out.println("��ֵ��:" + hashMap.entrySet());
		if(hashMap.containsKey("Jack"))
		{
			System.out.print("Jack������:");
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
		 * <font color = "red"> <i> ���ǵ�toString���� </i> </font>
		 */

	}
}
