package com.beifeng.test;

public class CV 
{
	String name;
	int age;
	int workyear;
	int project_num;
	String technique;
	String favour;
	public CV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CV(String name, int age, int workyear, int project_num,
			String technique, String favour) {
		super();
		this.name = name;
		this.age = age;
		this.workyear = workyear;
		this.project_num = project_num;
		this.technique = technique;
		this.favour = favour;
	}
	
	/**
	<p align = "center">
		<font color = "red">
		<i>
		���ǵ�toString����
		</i>
		</font>
	*/
	@Override	
	public String toString() {
		return "���ͬѧ�������ǣ�" + name + "\n �����ǣ�" + age + "\n ������" + workyear
				+ "����\n ����" + project_num + "����Ŀ\n ����������" + technique
				+ "\n ��Ȥ�����ǣ�" + favour;
	}
	public static void main(String[] args) {
		CV cv = new CV("xiaoxiao",18,2,4,"Java","football");
		System.out.println(cv);
		System.out.println(new CV());
	}

}
