package com.test.mavenProject.MavenProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import com.java.mavenProject.GenericPackage.Generic;
import com.java.mavenProject.GenericPackage.GenericFunctions;
import com.java.mavenProject.GenericPackage.GetProperties;


public class TestRunner extends Generic {
	//static Scanner scanner;
	public static void main(String[] args) {
		GetProperties.initializeEnvironment("UiConfig");
		
		
		try {
			
			readTestCase = new Scanner(new File(inputfolder+"\\TestRunner.csv"));
			File file = new File(logTestcaseFolder+"logTestCaseFile.properties");
	          
	        if(file.exists())
	        {
	        	file.delete();
	            System.out.println("File deleted successfully");
	        }
	        else
	        {
	            System.out.println("Failed to delete the file");
	        }
			properties = new Properties();
			int count=0;
			while (readTestCase.hasNextLine()) // returns a boolean value
			{
				
				testCase= readTestCase.nextLine();
				randomTestCaseName = testCase+"_"+GenericFunctions.randomNumber();
				System.out.println("randomTestCaseName-->"+randomTestCaseName);
				GenericFunctions.runTestCase(testCase);
				properties.put(testCase, randomTestCaseName); 
				count++;
			}
			readTestCase.close();
			FileOutputStream outputStream = new FileOutputStream(logTestcaseFolder+"logTestCaseFile.properties");
			properties.store(outputStream, null);
			//properties.c
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Invalid File Provided");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
