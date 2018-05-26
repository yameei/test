package com.java.FileIOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class CopyFileWithInputSteam {

	public static void main(String[] args) throws IOException {
		FileInputStream is = new FileInputStream("E:\\img\\1.jpg");
		
		FileOutputStream os =new FileOutputStream("D:\\1_copy.jpg");
		
		byte bys[] = new byte[1024];
		int len;
		while((len=is.read(bys))!=-1){
			os.write(bys, 0, len);
		}
		is.close();
		os.close();
	}
	
	@Test
	public void method() throws IOException{
		File file = new File("D://test.txt");

		InputStream is = new FileInputStream(file);

		byte b[] = new byte[1024];

		int a = is.read(b);

		String str[] = new String(b,0,a).split("");

		int count = 0;

		for(int i = 0;i<str.length;i++){

		if("a".equals(str[i]))count++;

		}

		System.out.println(count);
	}
}
