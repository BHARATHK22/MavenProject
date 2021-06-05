package com.java.mavenProject.ReportModule;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.java.mavenProject.GenericPackage.*;

class HTMLReportSample extends Generic {

    public static void main(String arg[]) {//(String Statement,String flag,String Screeshot) throws Exception {
    	long source = System.currentTimeMillis(); 
        File f = new File(currentDirectory+"\\Report\\"+source+".html");
         //bw = null;
		try {
			BufferedWriter	bw = new BufferedWriter(new FileWriter(f));
		
        
			bw.write("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
					+ "<style>\r\n"
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
					+ "</style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "\r\n"
					+ "<h2>Animated Collapsibles</h2>\r\n"
					+ "\r\n"
					+ "<p>A Collapsible:</p>\r\n"
					+ "<button class=\"collapsible\">Open Collapsible</button>\r\n"
					+ "<div class=\"content\">\r\n"
					+ "  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\r\n"
					+ "</div>\r\n"
					+ "\r\n"
					+ "<p>Collapsible Set:</p>\r\n"
					+ "<button class=\"collapsible\">Open Section 1</button>\r\n"
					+ "<div class=\"content\">\r\n"
					+ "  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\r\n"
					+ "</div>\r\n"
					+ "<button class=\"collapsible\">Open Section 2</button>\r\n"
					+ "<div class=\"content\">\r\n"
					+ "  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\r\n"
					+ "</div>\r\n"
					+ "<button class=\"collapsible\">Open Section 3</button>\r\n"
					+ "<div class=\"content\">\r\n"
					+ "  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\r\n"
					+ "</div>\r\n"
					+ "\r\n"
					+ "<script>\r\n"
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
					+ "\r\n"
					+ "</body>\r\n"
					+ "</html>\r\n"
					+ "");
			 		bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        /*bw.write("<textarea cols=75 rows=10>");
        for (int ii=0; ii<20; ii++) {
            bw.write("Blah blah..");
        }
        bw.write("</textarea>");
        bw.write("</body></html>");
        */
       

        //Desktop.getDesktop().browse(f.toURI());
    }
}