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
		覆盖的toString方法
		</i>
		</font>
	*/
	@Override	
	public String toString() {
		return "这个同学的名字是：" + name + "\n 年龄是：" + age + "\n 工作了" + workyear
				+ "年了\n 做过" + project_num + "个项目\n 技术方向是" + technique
				+ "\n 兴趣爱好是：" + favour;
	}
	public static void main(String[] args) {
		CV cv = new CV("xiaoxiao",18,2,4,"Java","football");
		System.out.println(cv);
		System.out.println(new CV());
	}

}
