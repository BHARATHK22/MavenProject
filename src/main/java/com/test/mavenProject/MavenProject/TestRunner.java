package com.test.mavenProject.MavenProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class TestRunner extends Generic
{
    public static void main( String[] args )
    {
    	Scanner sc;
		try {
			sc = new Scanner(new File(inputfolder+"\\TestRunner.csv"));

			while (sc.hasNextLine()) 
			{
				
				String line=sc.nextLine();
				System.out.println("Line::"+line);
				
			}
			
			sc.close(); 
		} catch (FileNotFoundException e) {
			System.out.println("Exception is::"+e.getMessage());
			e.printStackTrace();
		}
    }
}
