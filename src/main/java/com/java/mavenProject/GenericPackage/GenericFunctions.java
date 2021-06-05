package com.java.mavenProject.GenericPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	public static boolean navigateToUrl(String actionItem) {
		
		//testStepStatus= false;
		driver.manage().window().maximize();
		driver.get(hm.get("URL"));
		String url = driver.getCurrentUrl();
		boolean flag = url.contentEquals(hm.get("URL"));
		if (flag == true) {
			
			testStepStatus=true;
		} 
		else {
			
			testStepStatus=false;
		}
		return testStepStatus;
	}
	
	public static boolean isDisplayed(String webElement) {
			
		testStepStatus=false;
		xpath = ReadData.readWebElement(webElement);
		try {
			if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
			
				testStepStatus=true;
			} 
			else {
				
				testStepStatus=false;
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return testStepStatus;
	}
	public static boolean clickElement(String webElement) {
		
		testStepStatus=false;
		xpath = ReadData.readWebElement(webElement);
		if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
			
			driver.findElement(By.xpath(xpath)).click();
			testStepStatus=true;
		} 
		else {
			
			testStepStatus=false;
		}
		return testStepStatus;
	}

	public static boolean inputTxtData(String webElement, String inputFile, String inputValue) {
		testStepStatus=false;
		xpath = ReadData.readWebElement(webElement);
		
		System.out.println("*************Start of InputData*****************");
		HashMap<String, String> hashMap = ReadData.readWebElementValue(inputFile,inputValue);
		System.out.println("hashMap::" + hashMap.toString());
		System.out.println("*************End of InputData*****************");
		
		System.out.println("****************Start of Xpath*******************");
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		System.out.println("****************End of Xpath*********************");

		Set<String> keys = hashMap.keySet();
		Iterator<String> iterator = keys.iterator();
		System.out.println("InputData keys::"+keys.toString());
		
		if (list.size() == keys.size()) {
			System.out.println("WebElement Found::");
			for (int i = 0; i < list.size(); i++) {
				list.get(i).sendKeys(hashMap.get(iterator.next()));
			}
			testStepStatus= true;
		} 
		else {

			testStepStatus=false;
		}
		return testStepStatus;
	}
}
