
class Dog extends Pet
{
	private String strain;
	static Dog p1 = new Dog("ŷŷ","ѩ����");
	static Dog p2 = new Dog("����","��������Ȯ");
	static Dog p3 = new Dog("�Ʒ�", "��������Ȯ");
	static Dog p4 = new Dog("����", "ѩ����");

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
