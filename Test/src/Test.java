import java.util.*;

public class Test
{
	public static void main(String[] args)
	{
		Integer b = 128;
		String s = "wqwwwwwww";
		Study study = new Study(Unit.U1, "第一单元打基础");
		System.out.println(new Study(Unit.U1, "第一单元打基础"));
		System.out.println(new Study(Unit.U2, "第二单元可以胜任Java程序开发"));
		System.out.println(new Study(Unit.U3, "第二单元可以胜任企业级Java开发"));
		switch (study.unit)
		{
		case U1:
			System.out.println(study.unit.value+"打基础");

		case U2:
			System.out.println(study.unit.value+"可以胜任Java程序开发");

		case U3:

		}

	}
}

class Study
{
	public Study(Unit unit, String content)
	{
		super();
		this.unit = unit;
		this.content = content;
	}

	Unit unit;
	String content;

	@Override
	public String toString()
	{
		return "Study [unit=" + unit + ", content=" + content + "]";
	}

}

enum Unit
{
	U1("第一单元"), U2("第二单元"), U3("第三单元");
	String value;

	private Unit(String value)
	{
		this.value = value;
	}

}

class TestHashMap
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
		for (Object o : hashMap.keySet())
		{
			Student tep = hashMap.get(o);
			System.out.print(tep.favour + ":");
			System.out.println(tep);
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

class TestArrayList
{
	public static void main(String[] args)
	{
		List<Dog> l = new ArrayList<Dog>();
		l.add(Dog.p1);
		l.add(Dog.p2);
		for (int i = 0; i < l.size(); i++)
		{
			Dog tep = (Dog) l.get(i);
			System.out.println(tep.toString());
		}
		List<NewsTitle> l2 = new ArrayList<NewsTitle>();
		NewsTitle newsTitle = new NewsTitle(0, "hao", "xiaoming");
		NewsTitle newsTitle2 = new NewsTitle(1, "haha", "wang");
		l2.add(newsTitle);
		l2.add(newsTitle2);
		for (int i = 0; i < l2.size(); i++)
		{
			NewsTitle tep = (NewsTitle) l2.get(i);
			System.out.println(tep.getTitle());
		}

	}
}

class TestHashSet
{
	public static void main(String[] args)
	{
		HashSet<Dog> s1 = new HashSet<Dog>();
		s1.add(Dog.p1);
		s1.add(Dog.p2);
		s1.add(Dog.p3);
		s1.add(Dog.p4);
		System.out.println("共计有" + s1.size() + "条狗狗\n分别是:");
		Iterator<Dog> iterator = s1.iterator();
		while (iterator.hasNext())
		{
			Dog tep = (Dog) iterator.next();
			System.out.println(tep.getName() + "\t" + tep.getStrain());
		}

	}
}
