package com.beifeng.test.Java�������.A1009;

public class Homework2
{

	public static void main(String[] args)
	{
		School school = new School("������", 30, 40);
		school.showCenter();

	}

}

class School
{
	String schoolName;
	int classNumber;
	int labNumber;

	public School()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String schoolName, int classNumber, int labNumber)
	{
		super();
		this.schoolName = schoolName;
		this.classNumber = classNumber;
		this.labNumber = labNumber;
	}

	void showCenter()
	{
		System.out.println(schoolName + "��Ӗ����" + "��" + classNumber + "���༶,"
				+ labNumber + "�����.");

	}
}
