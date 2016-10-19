package top.jggnice.beans;

public abstract class Handset
{
	private String brand;
	private String type;
	public abstract void call();
	public abstract void info();
	public Handset(String brand, String type)
	{
		super();
		this.brand = brand;
		this.type = type;
	}
	public Handset()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getType()
	{
		return type;
	}
	public String toString()
	{
		return "这是一款型号为" + getType() + "的" + getBrand() + "手机";
	}
}
