package io;

import image.PIC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MyFile
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader is = new InputStreamReader(PIC.class.getResourceAsStream("ll.txt"),"UTF-8");
		char[] chs = new char[64];
		is.read(chs);
		System.out.println(chs);

	}

	void FiletoFile() throws Exception
	{
		File file = new File(PIC.class.getResource("kydj.jpg").toURI());
		File file2 = new File("gg.jpg");
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file2);
		byte words[] = new byte[1024];
		while (fis.available() > 0)
		{
			int read = fis.read(words);
			fos.write(words, 0, read);
		}
		fis.close();
		fos.close();
	}
}
