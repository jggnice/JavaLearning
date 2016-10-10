package com.beifeng.test.Java面向对象.A1009;

public class Homework2
{

	public static void main(String[] args)
	{
		School school = new School("北风网", 30, 40);
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
		System.out.println(schoolName + "培訓中心" + "有" + classNumber + "个班级,"
				+ labNumber + "间教室.");

	}
}
