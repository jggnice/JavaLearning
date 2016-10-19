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
		System.out.println("��һ�������ǳ���:" + linkedList.removeFirst().getName());
		System.out.println("���һ�������ǳ���:" + linkedList.removeLast().getName());
		System.out.println("\nɾ���󹲼���" + linkedList.size() + "������\n�ֱ���:");
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
		{ new Dog("ŷŷ", "ѩ����"), new Dog("����", "��������Ȯ"), new Dog("�Ʒ�", "��������Ȯ"),
				new Dog("����", "ѩ����") };

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
			return super.toString() + "\n����һֻ" + strain;
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
			return "������԰�:\n�ҵ����ֽ�" + name + ", �ҵĽ���ֵ��" + health + ",�Һ����˵����ܶ���"
					+ love + ".";
		}

		public String getName()
		{
			return name;
		}

	}
}
