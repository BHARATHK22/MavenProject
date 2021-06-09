package com.java.mavenProject.ReportModule;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.java.mavenProject.GenericPackage.Generic;



public class TEST_RESULT extends Generic {

	public static void createFileReport() {
		try {
			testResultbuffer.write("<html>");
			testResultbuffer.write("<h2><center>Project Automation Test Reports</center></h2>");
			
			
			testResultbuffer.write("<style>table, th, td {border: 1px solid black;border-collapse: collapse;}</style>");
			
			testResultbuffer.write("<body>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void createTestCaseReport() {

		try {
			testResultbuffer.write("<button class=\"collapsible\"><Center>"+testCase+"</Center></button>");
			testResultbuffer.write("<div class=\"content\">");
			testResultbuffer.write("<table style=\"width:100%\"><tr><th>Action-Event</th><th>Properties</th><th>Result</th><th>Screenshot</th></tr>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testStepReport(String actionItem, String properties, String result, String screenShot) {
		
		try {
			//String red="green";
			System.out.println("screenShotPath::"+screenShot);
			testResultbuffer.write("<tr>");
			testResultbuffer.write("<td>"+actionItem+"</td>");
			testResultbuffer.write("<td>"+properties+"</td>");
			testResultbuffer.write("<td>"+result+"</td>");
			testResultbuffer.write("<td>");
			testResultbuffer.write("<img src=\""+screenShot+"\" alt=\"image-failed\" width=\"40\" height=\"30\">");
			testResultbuffer.write("</td>");
			testResultbuffer.write("</tr>");
			
		} catch (Exception e) {
			System.out.println("Exception ::" + e.getMessage());
		}
		// Desktop.getDesktop().browse(f.toURI());
	}
	public static void closeTestCaseReport() {
		try {
			
			testResultbuffer.write("<style>\r\n");
			if(setColor=="green") {
				testResultbuffer.write(".collapsible {\r\n"
					+ "  background-color:green;\r\n"
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
					+ "  background-color: "+setColor+";\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".content {\r\n"
					+ "  padding: 0 18px;\r\n"
					+ "  max-height: 0;\r\n"
					+ "  overflow: hidden;\r\n"
					+ "  transition: max-height 0.2s ease-out;\r\n"
					+ "  background-color: #f1f1f1;\r\n"
					+ "}\r\n");
			}
			else if(setColor=="red"){
				testResultbuffer.write(".collapsible1 {\r\n"
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
						+ "");
			}
			testResultbuffer.write("</style>");
			testResultbuffer.write("</table>");
			testResultbuffer.write("</div>");
			testResultbuffer.write("<br>");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void closeFileReport() {
		try {
			
			testResultbuffer.write("<script>\r\n");
			
				testResultbuffer.write("var coll = document.getElementsByClassName(\"collapsible\");\r\n"
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
					+ "}\r\n");
				
				testResultbuffer.write("var coll1 = document.getElementsByClassName(\"collapsible1\");\r\n"
						+ "var j;\r\n"
						+ "for (j = 0; j < coll1.length; j++) {\r\n"
						+ "  coll1[j].addEventListener(\"click\", function() {\r\n"
						+ "    this.classList.toggle(\"active\");\r\n"
						+ "    var content1 = this.nextElementSibling;\r\n"
						+ "    if (content1.style.maxHeight){\r\n"
						+ "      content1.style.maxHeight = null;\r\n"
						+ "    } else {\r\n"
						+ "      content1.style.maxHeight = content1.scrollHeight + \"px\";\r\n"
						+ "    } \r\n"
						+ "  });\r\n"
						+ "}\r\n");
			
			testResultbuffer.write("</script>\r\n");
			testResultbuffer.write("</body>");
			testResultbuffer.write("</html>");
			testResultbuffer.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteDirectory(File file)
    {
        
        for (File subfile : file.listFiles()) {
  
            if (subfile.isDirectory()) {
                deleteDirectory(subfile);
            }
            
            subfile.delete();
        }
    }
}