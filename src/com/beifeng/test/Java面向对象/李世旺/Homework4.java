package com.beifeng.test.Java�������.������;

public class Homework4
{

	public static void main(String[] args)
	{
		
		Student student = new Student("С��",16,"S245��","������");
		Teacher teacher = new Teacher("����ʦ","�����","ʹ������",5);
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
	 * <font color = "red"> <i> ���ǵ�toString���� </i> </font>
	 */
	@Override
	public String toString()
	{
		return "���ͬѧ�������ǣ�" + name + "\n�����ǣ�" + age + "\n�Ͷ���" + clno
				
				+ "\n��Ȥ�����ǣ�" + favour;
	}

}

/**
 * <p align = "center">
 * <font color = "red"> <i> ��ʦ�� </i> </font>
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
	 * <font color = "red"> <i> ���ǵ�toString���� </i> </font>
	 */
	public String toString()
	{
		return "��ʦ������" + name + "\n" + "�ڿη���" + course + "\n" + "�γ����ݣ�"
				+ content + "\n" + "���g" + tage;
	}

}
