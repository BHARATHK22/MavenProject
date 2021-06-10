package com.java.mavenProject.GenericPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.java.mavenProject.ReportModule.HTMLReport;
import com.java.mavenProject.ReportModule.TEST_RESULT;
import com.java.mavenProject.ReportModule.TEST_RESULT_testRunner;

public class ActionItem extends Generic {

  public static void actionTest(String actionItem) {
		System.out.println(actionItem);
		String[] line = actionItem.split(",");
		System.out.println("Action ::" + line[0]);
		

	switch (CMD.valueOf(line[0])) {

		case Click:
			
			System.out.println("*************Start of Click*****************");
			testStepStatus=GenericFunctions.clickElement(line[1]);
			screenShot=GenericFunctions.screeshot(driver);
			if(testStepStatus==true) {
				
				System.out.println("WebElement is clicked::");
				HTMLReport.testReport(line[0], line[1], "PASS", screenShot);
				TEST_RESULT_testRunner.eachTestStepReport(line[0], line[1], "PASS", screenShot);
			}
			else if(testStepStatus==false) {
				setColor="red";
				System.out.println("WebElement is not clickable::");
				HTMLReport.testReport(line[0], line[1], "FAIL", screenShot);
				TEST_RESULT_testRunner.eachTestStepReport(line[0], line[1], "FAIL", screenShot);
				readTestStep.close();
			}
			System.out.println("*************End of Click*****************");
			
			break;

		case InputData:
			
			System.out.println("*************Start of Input*****************");
			testStepStatus=GenericFunctions.inputTxtData(line[1],line[2],line[3]);
			screenShot=GenericFunctions.screeshot(driver);
			if(testStepStatus==true) {
				
				System.out.println("InputData is entered::");
				HTMLReport.testReport(line[0], line[1], "PASS", screenShot);
				TEST_RESULT_testRunner.eachTestStepReport(line[0], line[1], "PASS", screenShot);
			}
			else if(testStepStatus==false) {
				setColor="red";
				System.out.println("InputData is not entered::");
				HTMLReport.testReport(line[0], line[1], "FAIL", screenShot);
				TEST_RESULT_testRunner.eachTestStepReport(line[0], line[1], "FAIL", screenShot);
				readTestStep.close();
			}
			System.out.println("*************End of Input*****************");
						break;
		case Navigate:
			System.out.println("*************START*************");
			if (hm.get("environment").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", driversPath + "\\chromedriver.exe");
				if(hm.get("headless").equalsIgnoreCase("true")) {
					ChromeOptions options = new ChromeOptions();
					options.addArguments("headless");
					driver = new ChromeDriver(options);
				}
				if(hm.get("headless").equalsIgnoreCase("false")) {
					driver = new ChromeDriver();
				}	
			}
			if (hm.get("environment").equalsIgnoreCase("firefox")) {
				System.out.println("firefox not available");
			}
			
			testStepStatus=GenericFunctions.navigateToUrl(line[1]);
			screenShot=GenericFunctions.screeshot(driver);
			if(testStepStatus==true){
				
				System.out.println("Navigate to url::"+line[1]);
				HTMLReport.testReport(line[0], line[1], "PASS", screenShot);
				TEST_RESULT_testRunner.eachTestStepReport(line[0], line[1], "PASS", screenShot);
			}
			else if(testStepStatus==false) {
				setColor="red";
				System.out.println("Navigate function failed::"+line[1]);
				HTMLReport.testReport(line[0], line[1], "FAIL", screenShot);
				TEST_RESULT_testRunner.eachTestStepReport(line[0], line[1], "FAIL", screenShot);
				readTestStep.close();
			}
			break;
			
		case IsDisplayed:
			
			System.out.println("*************Start of IsDisplayed*****************");
			testStepStatus=GenericFunctions.isDisplayed(line[1]);
			screenShot=GenericFunctions.screeshot(driver);
			
			if(testStepStatus==true) {
				
				System.out.println("WebElement Found::");
				HTMLReport.testReport(line[0], line[1], "PASS", GenericFunctions.screeshot(driver));
				TEST_RESULT_testRunner.eachTestStepReport(line[0], line[1], "PASS", screenShot);
			}
			else if(testStepStatus==false) {
				setColor="red";
				System.out.println("WebElement Not Found::");
				HTMLReport.testReport(line[0], line[1]+"\tWebElement Not Found", "FAIL", GenericFunctions.screeshot(driver));
				TEST_RESULT_testRunner.eachTestStepReport(line[0], line[1], "FAIL", screenShot);
			}
			
			System.out.println("*************End of IsDisplayed*****************");
			break;

		case Quit:
			driver.close();
			HTMLReport.testReport(line[0], "", "PASS", "");
			break;
			
		default:
			System.out.println("Incorrect input keyword proived");
			break;
		}

	}
}
