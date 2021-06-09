package com.test.mavenProject.MavenProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.java.mavenProject.GenericPackage.ActionItem;
import com.java.mavenProject.GenericPackage.Generic;

public class ReadTestCase extends Generic{
	public static boolean readTestCase(String testCase) {

		testStepStatus=true;
		
		try {
			readTestStep = new Scanner(new File(inputfolder+"\\"+testCase+".csv"));

			while (readTestStep.hasNextLine()) 
			{
				if(testStepStatus==false) {
					driver.quit();
					System.out.println("ReadTestCase is stopped running current step since previous step is failed::");
					//testStepStatus=true;
					break;
				}
				String line=readTestStep.nextLine();
				//System.out.println("Line::"+line);
				if(line.contains("Action")) {
					continue;
				}
				ActionItem.actionTest(line);
			}
			
			//if(testStepStatus==true) {
				readTestStep.close(); 
			//}
				
		} catch (FileNotFoundException e) {
			System.out.println("Exception is::"+e.getMessage());
			e.printStackTrace();
		}
		return testStepStatus;
	}

}
