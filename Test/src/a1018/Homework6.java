package a1018;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Homework6
{
	public static void main(String[] args)
	{
		HashMap<Integer,Dog> map = new HashMap<>();
		for (int i = 0; i < Dog.dogs.length; i++)
		{
			map.put(i, Dog.dogs[i]);
		}
		Iterator<Integer> iterator = map.keySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(map.get(iterator.next()));
		}
		System.out.println("\n--------------------\n------��ǿ��forѭ��------\n");
		for (Map.Entry<Integer, Dog> entry : map.entrySet())
		{
			System.out.println(entry.getValue());
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
