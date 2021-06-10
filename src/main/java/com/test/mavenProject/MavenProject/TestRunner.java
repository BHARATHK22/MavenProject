package com.test.mavenProject.MavenProject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import com.java.mavenProject.GenericPackage.Generic;
import com.java.mavenProject.GenericPackage.GenericFunctions;
import com.java.mavenProject.GenericPackage.GetProperties;
import com.java.mavenProject.ReportModule.TEST_RESULT;
import com.java.mavenProject.ReportModule.TEST_RESULT_testRunner;


public class TestRunner extends Generic {
	//static Scanner scanner;
	public static void main(String[] args) {
		GetProperties.initializeEnvironment("UiConfig");
		
		
		try {
			//TestReportFile = new File(htmlReportPath+"TEST_RESULT_"+GenericFunctions.randomNumber()+".html");
			//testResultbuffer = new BufferedWriter(new FileWriter(TestReportFile));
			TEST_RESULT_testRunner.initTestCaseReportFile();
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
			int count=-1;
			//TEST_RESULT.createFileReport();
			while (readTestCase.hasNextLine()) // returns a boolean value
			{
				//testCaseStatus=true;
				System.out.println("******testCaseStatus-->"+testCaseStatus);
				testCase= readTestCase.nextLine();
				//TEST_RESULT.createTestCaseReport();
				randomTestCaseName = testCase+"_"+GenericFunctions.randomNumber();
				System.out.println("randomTestCaseName-->"+randomTestCaseName);
				testCaseStatus=GenericFunctions.runTestCase(testCase);
//				if(testCaseStatus==false) {
//					noOfFailedTests=noOfFailedTests+1;
//					System.out.println("TestCase Failed, Please investigate::");
//					TEST_RESULT_testRunner.appendButtonDiv();
//				}
//				if(testCaseStatus==true) {
//					noOfPassedTests=noOfPassedTests+1;
//					System.out.println("TestCase Passed @TestRunner.Java::");
//					TEST_RESULT_testRunner.appendButtonDiv();
//				}
				properties.put(testCase, randomTestCaseName);
				TEST_RESULT_testRunner.appendButtonDiv();
				count++;
				setColor="green";
			}
			if(count==0) {
				System.out.println("Only one test case is available to run-->"+count);
				readTestCase.close();
			}	
			//TEST_RESULT.closeFileReport();
			 //TEST_RESULT_testRunner.initTestCaseReportFile();
			 TEST_RESULT_testRunner.closeTestReportFile();
			 FileOutputStream outputStream = new FileOutputStream(logTestcaseFolder+"logTestCaseFile.properties");
			 properties.store(outputStream, null);
			//FileUtils.deleteDirectory(new File(screenshotPath));
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
