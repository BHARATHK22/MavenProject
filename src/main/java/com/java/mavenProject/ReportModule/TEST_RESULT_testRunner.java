package com.java.mavenProject.ReportModule;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.java.mavenProject.GenericPackage.Generic;
import com.java.mavenProject.GenericPackage.GenericFunctions;



public class TEST_RESULT_testRunner extends Generic {

	public static void initTestCaseReportFile() {
		try {
			
			HtmlTestReportFile = new File(completeTestReportPath+"TEST_RESULT_testRunner"+".html");
			if(HtmlTestReportFile.exists())
	        {
				HtmlTestReportFile.delete();
	            System.out.println("completeTestReportPath file deleted successfully");
	        }
	        else
	        {
	            System.out.println("completeTestReportPath failed to delete the file");
	        }
			recordReportBuffer = new BufferedWriter(new FileWriter(HtmlTestReportFile));
			recordReportBuffer.write("<html>");
			recordReportBuffer.write("<head>");
			recordReportBuffer.write("<h2><center>Project Automation Test Reports</center></h2>");
			recordReportBuffer.write("<style>table, th, td {border: 1px solid black;border-collapse: collapse;}</style>");
			recordReportBuffer.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
					+ "\r\n"
					+ "<style>\r\n"
					+ ".collapsible {\r\n"
					+ "  background-color: green;\r\n"
					+ "  color: white;\r\n"
					+ "  cursor: pointer;\r\n"
					+ "  padding: 18px;\r\n"
					+ "  width: 100%;\r\n"
					+ "  border: none;\r\n"
					+ "  text-align: left;\r\n"
					+ "  outline: none;\r\n"
					+ "  font-size: 15px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".active, .collapsible:hover {\r\n"
					+ "  background-color: green;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".content {\r\n"
					+ "  padding: 0 18px;\r\n"
					+ "  max-height: 0;\r\n"
					+ "  overflow: hidden;\r\n"
					+ "  transition: max-height 0.2s ease-out;\r\n"
					+ "  background-color: #f1f1f1;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ ".collapsible1 {\r\n"
					+ "  background-color: red;\r\n"
					+ "  color: white;\r\n"
					+ "  cursor: pointer;\r\n"
					+ "  padding: 18px;\r\n"
					+ "  width: 100%;\r\n"
					+ "  border: none;\r\n"
					+ "  text-align: left;\r\n"
					+ "  outline: none;\r\n"
					+ "  font-size: 15px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".active, .collapsible1:hover {\r\n"
					+ "  background-color: red;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".content1 {\r\n"
					+ "  padding: 0 18px;\r\n"
					+ "  max-height: 0;\r\n"
					+ "  overflow: hidden;\r\n"
					+ "  transition: max-height 0.2s ease-out;\r\n"
					+ "  background-color: #f1f1f1;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "</style>");
			recordReportBuffer.write("</head>");
			recordReportBuffer.write("<body>");
		}catch(Exception e) {
			System.out.println("Exception in creating TEST_RESULT_testRunner file");
		}	
	}
	public static void appendButtonDiv() {
		
		appendPassedTestReport= "<button class=\"collapsible\";style=\"background-color:green\"><Center>"+testCase+"</Center></button>"
									 + "<div class=\"content\">"
									 + "<table style=\\\"width:100%\\\"><tr><th>Action-Event</th><th>Properties</th><th>Result</th><th>Screenshot</th></tr>"
									 + recordTestStep;
		appendFailedTestReport= "<button class=\"collapsible1\";style=\"background-color:red\"><Center>"+testCase+"</Center></button>"
				 					 + "<div class=\"content1\">"
				 					 + "<table style=\\\"width:100%\\\"><tr><th>Action-Event</th><th>Properties</th><th>Result</th><th>Screenshot</th></tr>"
				 					 + recordTestStep;
		if(testStepStatus==true) {
			try {
				recordReportBuffer.write(appendPassedTestReport);
				recordReportBuffer.write("</table>");
				recordReportBuffer.write("</div>");
				recordReportBuffer.write("<br>");
				appendPassedTestReport="";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(testStepStatus==false) {
			try {
				recordReportBuffer.write(appendFailedTestReport);
				recordReportBuffer.write("</table>");
				recordReportBuffer.write("</div>");
				recordReportBuffer.write("<br>");
				appendPassedTestReport="";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		recordTestStep="";
				
	}
	
	public static void eachTestStepReport(String actionItem, String properties, String result, String screenShot) {
		
		try {
			recordTestStep=recordTestStep+"<tr>"+"<td>"+actionItem+"</td>"+"<td>"+properties+"</td>"+"<td>"+result+"</td>"+"<td>"+"<img src=\""+screenShot+"\" alt=\"image-failed\" width=\"40\" height=\"30\">"+"</td>"+"</tr>";
			System.out.println("TEST STEP RECORDER::"+recordTestStep);
	
		} catch (Exception e) {
			System.out.println("Exception ::" + e.getMessage());
		}
		// Desktop.getDesktop().browse(f.toURI());
		//return recordTestStep;
	}
	
	public static void closeTestReportFile() {
		try {
			
				recordReportBuffer.write("<script>\r\n"
						+ "var coll = document.getElementsByClassName(\"collapsible\");\r\n"
						+ "var i;\r\n"
						+ "\r\n"
						+ "for (i = 0; i < coll.length; i++) {\r\n"
						+ "  coll[i].addEventListener(\"click\", function() {\r\n"
						+ "    this.classList.toggle(\"active\");\r\n"
						+ "    var content = this.nextElementSibling;\r\n"
						+ "    if (content.style.maxHeight){\r\n"
						+ "      content.style.maxHeight = null;\r\n"
						+ "    } else {\r\n"
						+ "      content.style.maxHeight = content.scrollHeight + \"px\";\r\n"
						+ "    } \r\n"
						+ "  });\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "var coll1 = document.getElementsByClassName(\"collapsible1\");\r\n"
						+ "for (i = 0; i < coll1.length; i++) {\r\n"
						+ "  coll1[i].addEventListener(\"click\", function() {\r\n"
						+ "    this.classList.toggle(\"active\");\r\n"
						+ "    var content1 = this.nextElementSibling;\r\n"
						+ "    if (content1.style.maxHeight){\r\n"
						+ "      content1.style.maxHeight = null;\r\n"
						+ "    } else {\r\n"
						+ "      content1.style.maxHeight = content1.scrollHeight + \"px\";\r\n"
						+ "    } \r\n"
						+ "  });\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "</script>");
			recordReportBuffer.write("</body>");
			recordReportBuffer.write("</html>");
			recordReportBuffer.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}