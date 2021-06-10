package com.java.mavenProject.GenericPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.WebDriver;

public class Generic {
	public static String currentDirectory = System.getProperty("user.dir");
	public static String inputfolder = currentDirectory + "\\InputFiles";
	public static String driversPath = currentDirectory + "\\Drivers";
	public static String locatorPathFolder = currentDirectory + "\\Locators";
	public static String[] root;
	public static int count = 0;
	public static int flag = 0;
	public static WebDriver driver;
	public static Scanner readTestCase;
	public static JSONObject jsonObject;
	public static JSONParser jsonParser = new JSONParser();
	public static String environment;
	public static HashMap<String, String> hm = new HashMap<String, String>();
	public static long randomNumber;
	public static File HtmlReportFile; 
	public static File HtmlTestReportFile;
	public static BufferedWriter bw;
	public static BufferedWriter recordReportBuffer;
	public static String targetKey;
	public static boolean status=false;
	public static HashMap<String,String> childSetValue=null;
	public static String testCase=null;
	public static String htmlReportPath=System.getProperty("user.dir") + "\\Report\\" ;
	public static String screenshotPath = System.getProperty("user.dir") +"\\Report\\Screnshot\\";
	public static String randomTestCaseName;
	public static String logTestcaseFolder=System.getProperty("user.dir")+"\\logTestcaseFolder\\";
	public static FileWriter myWriter;
	public static Properties properties;
	public static boolean testStepStatus=true;
	public static Scanner readTestStep;
	public static String xpath;
	public static File TestReportFile;
	public static  BufferedWriter testResultbuffer;
	public static String setColor="green";
	public static boolean testCaseStatus=true;
	public static String recordTestStep="";
	public static String appendPassedTestReport;
	public static String appendFailedTestReport;
	public static String completeTestReportPath=htmlReportPath+"TEST_REPORT//";
}

