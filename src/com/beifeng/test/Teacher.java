package com.beifeng.test;
/**
<p align = "center">
	<font color = "red">
	<i>
	��ʦ��
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
		���ǵ�toString����
		</i>
		</font>
	*/
	public String toString()
	{
		return	"��ʦ������"+name + "\n"
	+"�ڿη���"+	course + "\n"
	+"�γ����ݣ�"+ 	content + "\n";
	}
	
}
