package com.java.mavenProject.GenericPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.java.mavenProject.ReportModule.HTMLReport;
import com.test.mavenProject.MavenProject.ReadTestCase;

public class GenericFunctions extends Generic {

	public static String screeshot(WebDriver driver) {

		//long randomNumber = System.currentTimeMillis();
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		String dest = screenshotPath+ randomNumber() + ".png";
		File destination = new File(dest);
		try {
			FileUtils.copyFile(SrcFile, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dest;

	}
	
	public static void runTestCase(String testCase) {
		
		

		try {
			
		HtmlReportFile = new File(htmlReportPath+randomTestCaseName+ ".html");
		bw = new BufferedWriter(new FileWriter(HtmlReportFile));
		
		
		System.out.println("Started executing Test Case::"+testCase);
		HTMLReport.initialize();
		ReadTestCase.readTest(testCase);
		System.out.println("Finished executing Test Case::"+testCase);
		HTMLReport.closeReport();
		bw.close();
		//saveTestReportFileName();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static long randomNumber(){
		return System.currentTimeMillis();

	}
	
}
