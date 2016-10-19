package a1018;

import java.util.Iterator;
import java.util.LinkedList;

public class Homework3
{
	public static void main(String[] args)
	{
		LinkedList<Dog> linkedList = new LinkedList<>();
		for (int i = 0; i < Dog.dogs.length; i++)
		{
			linkedList.add(Dog.dogs[i]);
		}
		System.out.println("第一条狗的昵称是:" + linkedList.removeFirst().getName());
		System.out.println("最后一条狗的昵称是:" + linkedList.removeLast().getName());
		System.out.println("\n删除后共计有" + linkedList.size() + "条狗狗\n分别是:");
		Iterator<Dog> iterator1 = linkedList.iterator();
		while (iterator1.hasNext())
		{
			Dog tep = (Dog) iterator1.next();
			System.out.println(tep.getName() + "\t" + tep.getStrain());
		}
	}

	static class Dog extends Pet
	{
		private String strain;
		static Dog[] dogs =
		{ new Dog("欧欧", "雪拉瑞"), new Dog("亚亚", "拉布拉多犬"), new Dog("菲菲", "拉布拉多犬"),
				new Dog("美美", "雪拉瑞") };

		public String getStrain()
		{
			return strain;
		}

		public Dog()
		{
			super();
			// TODO Auto-generated constructor stub
		}

		public Dog(String name, String strain)
		{
			this(name, 60, 60, strain);
		}

		public Dog(String name, int health, int love, String strain)
		{
			super(name, health, love);
			this.strain = (strain);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString()
		{
			return super.toString() + "\n我是一只" + strain;
		}

	}

	static class Pet
	{
		private String name;
		private int health;
		private int love;

		public Pet()
		{
			super();
			// TODO Auto-generated constructor stub
		}

		public Pet(String name, int health, int love)
		{
			super();
			this.name = name;
			this.health = health;
			this.love = love;
		}

		@Override
		public String toString()
		{
			return "宠物的自白:\n我的名字叫" + name + ", 我的健康值是" + health + ",我和主人的亲密度是"
					+ love + ".";
		}

		public String getName()
		{
			return name;
		}

	}
}
