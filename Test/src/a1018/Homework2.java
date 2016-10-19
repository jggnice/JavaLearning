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
		System.out.println("共计有" + l.size() + "条狗狗\n分别是:");
		Iterator<Dog> iterator = l.iterator();
		while (iterator.hasNext())
		{
			Dog tep = (Dog) iterator.next();
			System.out.println(tep.getName() + "\t" + tep.getStrain());
		}
		l.remove(Dog.dogs[0]);
		l.remove(Dog.dogs[1]);
		System.out.println("\n删除后共计有" + l.size() + "条狗狗\n分别是:");
		Iterator<Dog> iterator1 = l.iterator();
		while (iterator1.hasNext())
		{
			Dog tep = (Dog) iterator1.next();
			System.out.println(tep.getName() + "\t" + tep.getStrain());
		}
		if(l.contains(Dog.dogs[3]))
		{
			System.out.println("\n集合中包含美美的信息");
		}
	}
}

class Dog extends Pet
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
		return "宠物的自白:\n我的名字叫" + name + ", 我的健康值是" + health + ",我和主人的亲密度是"
				+ love + ".";
	}

	public String getName()
	{
		return name;
	}

}