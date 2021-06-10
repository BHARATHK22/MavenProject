package com.java.mavenProject.ReportModule;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;

import com.java.mavenProject.GenericPackage.Generic;



public class TEST_RESULT extends Generic {

	public static void main(String[] args) {
		
		/*
		 * Path path = Paths.get(System.getProperty("user.dir") +"\\Report\\Screnshot");
		 * 
		 * try (Stream<Path> walk = Files.walk(path)) { walk
		 * .sorted(Comparator.reverseOrder())
		 * .forEach(DirectoryDelete::deleteDirectoryJava8Extract); } try {
		 * Files.deleteIfExists(path); } catch (IOException e) { // TODO Auto-generated
		 * catch block System.out.println("Nothing deleted"); e.printStackTrace(); }
		 */
		 try {
			FileUtils.deleteDirectory(new File(System.getProperty("user.dir") +"\\Report\\Screnshot"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}