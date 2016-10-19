
class Dog extends Pet
{
	private String strain;
	static Dog p1 = new Dog("欧欧","雪拉瑞");
	static Dog p2 = new Dog("亚亚","拉布拉多犬");
	static Dog p3 = new Dog("菲菲", "拉布拉多犬");
	static Dog p4 = new Dog("美美", "雪拉瑞");

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
