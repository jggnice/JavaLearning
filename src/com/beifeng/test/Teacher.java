package com.beifeng.test;
/**
<p align = "center">
	<font color = "red">
	<i>
	教师类
	</i>
	</font>
*/
public class Teacher {
	String name;
	String course;
	String content;
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Teacher(String name, String course, String content) {
		super();
		this.name = name;
		this.course = course;
		this.content = content;
	}
	/**
	<p align = "center">
		<font color = "red">
		<i>
		覆盖的toString方法
		</i>
		</font>
	*/
	public String toString()
	{
		return	"老师姓名："+name + "\n"
	+"授课方向："+	course + "\n"
	+"课程内容："+ 	content + "\n";
	}
	
}
