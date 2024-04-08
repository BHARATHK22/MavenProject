package com.test.mavenProject.MavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class TestClassDemo {

	
	@Test
	public void readTestFile() {
		
		String filePath = System.getProperty("user.dir")+"//Resources//ReadData.txt";
		
		try {
			FileInputStream fis = new FileInputStream(new File(filePath));
			int n;
			while((n=fis.read())!=-1) {
				System.out.print((char)n);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
