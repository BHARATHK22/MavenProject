package com.test.mavenProject.MavenProject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import static org.junit.Assert.assertTrue;

//import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    { 
        System.out.println("Welcome this is Passed test");
        assertTrue(true);
    }
    @Test
    public void shouldAnswerWithFalse()
    { 
    	System.out.println("Welcome this is Failed test");
        assertTrue(true);
    }
    /*@Test
    public void launchAndCloseBrowser()
    { 
    	System.out.println("Welcome launchAndCloseBrowser test");
    	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();   
		driver.findElement(By.name("q")).sendKeys("Jenkins Pipeline",Keys.ENTER);
		driver.quit();
    }
    */
}
