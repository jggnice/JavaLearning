package a1018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework2
{
	public static void main(String[] args)
	{
		List<Dog> l = new ArrayList<Dog>();
		for (int i = 0; i < Dog.dogs.length; i++)
		{
			l.add(Dog.dogs[i]);
		}
		System.out.println("������" + l.size() + "������\n�ֱ���:");
		Iterator<Dog> iterator = l.iterator();
		while (iterator.hasNext())
		{
			Dog tep = (Dog) iterator.next();
			System.out.println(tep.getName() + "\t" + tep.getStrain());
		}
		l.remove(Dog.dogs[0]);
		l.remove(Dog.dogs[1]);
		System.out.println("\nɾ���󹲼���" + l.size() + "������\n�ֱ���:");
		Iterator<Dog> iterator1 = l.iterator();
		while (iterator1.hasNext())
		{
			Dog tep = (Dog) iterator1.next();
			System.out.println(tep.getName() + "\t" + tep.getStrain());
		}
		if(l.contains(Dog.dogs[3]))
		{
			System.out.println("\n�����а�����������Ϣ");
		}
	}
}

class Dog extends Pet
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

class Pet
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