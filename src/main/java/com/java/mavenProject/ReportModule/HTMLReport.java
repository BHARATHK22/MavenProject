package com.java.mavenProject.ReportModule;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.java.mavenProject.GenericPackage.Generic;



public class HTMLReport extends Generic {

	public static void initialize() {
		try {
			bw.write("<html>");
			bw.write("<h2><center>Project Automation Test Reports</center></h2>");
			bw.write("<style>table, th, td {border: 1px solid black;border-collapse: collapse;}</style>");
			bw.write("<style>\r\n"
					+ ".collapsible {\r\n"
					+ "  background-color: #777;\r\n"
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
					+ "  background-color: #555;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".content {\r\n"
					+ "  padding: 0 18px;\r\n"
					+ "  max-height: 0;\r\n"
					+ "  overflow: hidden;\r\n"
					+ "  transition: max-height 0.2s ease-out;\r\n"
					+ "  background-color: #f1f1f1;\r\n"
					+ "}\r\n"
					+ "</style>");
			bw.write("<body>");
			bw.write("<button class=\"collapsible\"><Center>"+testCase+"</Center></button>");
			bw.write("<div class=\"content\">");
			bw.write("<table style=\"width:100%\"><tr><th>Action-Event</th><th>Properties</th><th>Result</th><th>Screenshot</th></tr>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testReport(String actionItem, String properties, String result, String screenShot) {
		
		try {

			System.out.println("screenShotPath::"+screenShot);

			bw.write("<tr>");
			bw.write("<td>"+actionItem+"</td>");
			bw.write("<td>"+properties+"</td>");
			bw.write("<td>"+result+"</td>");
			bw.write("<td>");
			bw.write("<img src=\""+screenShot+"\" alt=\"image-failed\" width=\"40\" height=\"30\">");
			bw.write("</td>");
			bw.write("</tr>");
			//bw.write("<img src="+screenShot+"width=100 height=200></img>" );
			/*
			 * bw.write("<textarea cols=75 rows=10>"); for (int ii = 0; ii < 20; ii++) {
			 * bw.write("Blah blah.."); } bw.write("</textarea>");
			 */
			
		} catch (Exception e) {
			System.out.println("Exception ::" + e.getMessage());
		}
		// Desktop.getDesktop().browse(f.toURI());
	}
	public static void closeReport() {
		try {
			
			bw.write("</table>");
			bw.write("</div>");
			bw.write("<script>\r\n"
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
					+ "</script>\r\n"
					+ "");
			bw.write("</body>");
			bw.write("</html>");
			bw.close();
			
			/*String filepath = screenshotPath;
	        File file = new File(filepath);

	        deleteDirectory(file);
	        
	        
	        file.delete();
	       */
		} catch (IOException e) {
			
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