package com.test.mavenProject.MavenProject;

import org.junit.Assert;
import org.testng.annotations.Test;

public class ApiTest {
@Test
public void testPassMethod() {
	System.out.println("Pass Test");
	Assert.assertTrue(true);
}
@Test
public void testFailMethod() {
	System.out.println("Fail Test");
	Assert.assertTrue(true);
}
}
