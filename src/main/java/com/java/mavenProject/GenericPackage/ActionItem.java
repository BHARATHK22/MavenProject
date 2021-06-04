package com.java.mavenProject.GenericPackage;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.java.mavenProject.ReportModule.HTMLReport;

public class ActionItem extends Generic {

  public static void actionTest(String actionItem) {
		System.out.println(actionItem);
		String[] line = actionItem.split(",");
		System.out.println("Action ::" + line[0]);
		

	switch (CMD.valueOf(line[0])) {

		case Click:
			
			System.out.println("*************Start of Click*****************");
			testStepStatus=GenericFunctions.clickElement(line[1]);
			if(testStepStatus==true) {
				
				System.out.println("WebElement is clicked::");
				HTMLReport.testReport(line[0], line[1], "PASS", GenericFunctions.screeshot(driver));
			}
			else if(testStepStatus==false) {
				
				System.out.println("WebElement is not clickable::");
				HTMLReport.testReport(line[0], line[1], "FAILS", GenericFunctions.screeshot(driver));
				HTMLReport.closeReport();
				readTestStep.close();
			}
			System.out.println("*************End of Click*****************");
			
			break;

		case InputData:
			
			System.out.println("*************Start of Input*****************");
			testStepStatus=GenericFunctions.inputTxtData(line[1],line[2],line[3]);
			
			if(testStepStatus==true) {
				
				System.out.println("InputData is entered::");
				HTMLReport.testReport(line[0], line[1], "PASS", GenericFunctions.screeshot(driver));
			}
			else if(testStepStatus==false) {
				
				System.out.println("InputData is not entered::");
				HTMLReport.testReport(line[0], line[1], "FAILS", GenericFunctions.screeshot(driver));
				HTMLReport.closeReport();
				readTestStep.close();
			}
			System.out.println("*************End of Input*****************");
			/*System.out.println("*************Start of InputData*****************");
			HashMap<String, String> hashMap = ReadData.readWebElementValue(line[2], line[3]);
			System.out.println("hashMap::" + hashMap.toString());
			System.out.println("*************End of InputData*****************");
			System.out.println("*************Start of Xpath*****************");
			xpath = ReadData.readWebElement(line[1]);
			System.out.println("WebElement::" + xpath);
			System.out.println("*************End of Xpath*****************");
			try {

				
				//driver.navigate().refresh();
				//Thread.sleep(8000);
				List<WebElement> list = driver.findElements(By.xpath(xpath));

				Thread.sleep(3000);
				Set<String> keys = hashMap.keySet();
				java.util.Iterator<String> iterator = keys.iterator();
				System.out.println("InputData keys::"+keys.toString());
				if (list.size() == keys.size()) {
					System.out.println("WebElement Found::");
					for (int i = 0; i < list.size(); i++) {
						list.get(i).sendKeys(hashMap.get(iterator.next()));
					}
					HTMLReport.testReport(line[0], line[1] + "\n" + line[2] + "\n" + line[3], "PASS",
							GenericFunctions.screeshot(driver));
				} else {
					System.out.println("WebElement NOT  Found::");
					HTMLReport.testReport(line[0], line[1] + line[2] + line[3], "FAIL",GenericFunctions.screeshot(driver));
					HTMLReport.closeReport();
					//driver.quit();
					readTestStep.close();
				}
				list=null;
				Thread.sleep(3000);

			} catch (Exception e) {
				// TODO: handle exception
			}
			*/
			break;
		case Navigate:
			
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
			if(testStepStatus==true){
				
				System.out.println("Navigate to url::"+line[1]);
				HTMLReport.testReport(line[0], line[1], "PASS", GenericFunctions.screeshot(driver));
			}
			else if(testStepStatus==false) {
				
				System.out.println("Navigate function failed::"+line[1]);
				HTMLReport.testReport(line[0], line[1], "FAIL", GenericFunctions.screeshot(driver));
				HTMLReport.closeReport();
				readTestStep.close();
			}
			break;
			
		case IsDisplayed:
			
			System.out.println("*************Start of IsDisplayed*****************");
			testStepStatus=GenericFunctions.isDisplayed(line[1]);
			
			
			if(testStepStatus==true) {
				
				System.out.println("WebElement Found::");
				HTMLReport.testReport(line[0], line[1], "PASS", GenericFunctions.screeshot(driver));
			}
			else if(testStepStatus==false) {
				
				System.out.println("WebElement Not Found::");
				HTMLReport.testReport(line[0], line[1], "FAIL", GenericFunctions.screeshot(driver));
				HTMLReport.closeReport();
				readTestStep.close();
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
