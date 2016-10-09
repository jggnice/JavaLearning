package com.beifeng.test.Java面向对象.李世旺;

public class Homework4
{

	public static void main(String[] args)
	{
		
		Student student = new Student("小明",16,"S245班","打篮球");
		Teacher teacher = new Teacher("王老师","计算机","使用数组",5);
		System.out.println(student);
		System.out.println("----------------");
		System.out.println(teacher);
	}

	

}
class Student
{
	String name;
	int age;
	String clno;
	String favour;

	public Student(String name, int age, String clno, String favour)
	{
		super();
		this.name = name;
		this.age = age;
		this.clno = clno;
		this.favour = favour;
	}

	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p align = "center">
	 * <font color = "red"> <i> 覆盖的toString方法 </i> </font>
	 */
	@Override
	public String toString()
	{
		return "这个同学的名字是：" + name + "\n年龄是：" + age + "\n就读于" + clno
				
				+ "\n兴趣爱好是：" + favour;
	}

}

/**
 * <p align = "center">
 * <font color = "red"> <i> 教师类 </i> </font>
 */
 class Teacher
{
	String name;
	String course;
	String content;
	int tage;
	public Teacher(String name, String course, String content, int tage)
	{
		super();
		this.name = name;
		this.course = course;
		this.content = content;
		this.tage = tage;
	}

	

	public Teacher()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, String course, String content)
	{
		super();
		this.name = name;
		this.course = course;
		this.content = content;
	}

	/**
	 * <p align = "center">
	 * <font color = "red"> <i> 覆盖的toString方法 </i> </font>
	 */
	public String toString()
	{
		return "老师姓名：" + name + "\n" + "授课方向：" + course + "\n" + "课程内容："
				+ content + "\n" + "教齡" + tage;
	}

}
