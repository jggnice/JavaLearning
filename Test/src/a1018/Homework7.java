package a1018;

import java.util.HashMap;

public class Homework7
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
		 * <font color = "red"> <i> ���ǵ�toString���� </i> </font>
		 */
		@Override
		public String toString()
		{
			return "���ͬѧ�������ǣ�" + name + "\n�����ǣ�" + age + "\n�Ա���" + sex

			+ "\nӢ�������ǣ�" + favour;
		}

	}
}
