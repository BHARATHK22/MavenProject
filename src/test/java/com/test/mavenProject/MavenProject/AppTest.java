//
//  package com.test.mavenProject.MavenProject;
//  
//  import static org.junit.Assert.assertTrue;
//  
//  import java.io.IOException; import java.net.URISyntaxException; import
//  java.util.List;
//  
//  import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
//  org.openqa.selenium.WebDriver; import
//  org.openqa.selenium.chrome.ChromeDriver; import org.testng.ITestResult;
//  import org.testng.annotations.AfterMethod; import
//  org.testng.annotations.Test;
//  
//  import com.java.mavenProject.GenericPackage.Generic;
//  
//  import net.rcarz.jiraclient.BasicCredentials; import
//  net.rcarz.jiraclient.Issue; import net.rcarz.jiraclient.Issue.SearchResult;
//  import net.rcarz.jiraclient.IssueType; import
//  net.rcarz.jiraclient.JiraClient; import net.rcarz.jiraclient.JiraException;
//  import net.rcarz.jiraclient.RestClient; import
//  net.rcarz.jiraclient.RestException; import net.rcarz.jiraclient.Status;
//  
//  //import static org.junit.Assert.assertTrue;
//  
//  //import org.junit.Test;
//  
// /**
//	 * Unit test for simple App.
//	 */
//
//  public class AppTest extends Generic {
// /**
//	 * Rigorous Test :-)
//	 */
//		  @Test public void shouldAnswerWithTrue() {
//		  
//		  System.out.println("Welcome this is Passed test");
//		  //System.out.println("inputfolder-->"+inputfolder); assertTrue(true); }
//		  
//		  @Test public void shouldAnswerWithFalse() {
//		  System.out.println("Welcome this is Failed test"); assertTrue(true); }
//		  
//		  @AfterMethod public void jiraTest(ITestResult result) {
//		  if(result.getStatus()==ITestResult.FAILURE) { BasicCredentials creds= new
//		  BasicCredentials("bharathkalapakuri@hotmail.com","H5LvILUVjCg5YQuJtgua4465");
//		  JiraClient jira = new JiraClient("https://seleniumjenkins.atlassian.net/",
//		  creds); try {
//		  //jira.getRestClient().get("https://seleniumjenkins.atlassian.net/");
//		  SearchResult searchResult=jira.searchIssues("project='MavenProject'");
//		  //SearchResult searchResult=jira.
//		  //searchIssues("project = \"MavenProject\" AND fixVersion = \"Unscheduled\" AND cycleName = \"MavenProject\""); 
//		  System.out.println(searchResult.issues); 
//		  List<Issue> listOfIssues =searchResult.issues; 
//		  for(Issue issue:listOfIssues) {
//			  System.out.println("Issue-->"+issue); 
//			  jira.getIssue(issue.toString()).addAttachment(HtmlReportFile);;
//		  }
//		  
//		  
//		  //System.out.println(Issue.getBaseUri());
//		  //System.out.println(jira.getIssue("MavenProject"));
//		  //CZApiCycleClient zapi= new CZApiCycleClient(); //zapi.getCycleById(1); //RestClient restClient =
//		  //new RestClient(null, creds, null) //zapi.getExecutions("MAV"); } catch
//		  //(JiraException e) { // TODO Auto-generated catch block //e.printStackTrace();
//		  //}
//		  } 
//		  }
//		  
//		  @SuppressWarnings("unchecked")
//		  
//		  @Test public void jiraTest() {
//		  System.out.println("Welcome to no of test cases in test cycle::");
//		  BasicCredentials creds= new
//		  BasicCredentials("bharathkalapakuri@hotmail.com","H5LvILUVjCg5YQuJtgua4465");
//		  JiraClient jira = new JiraClient("https://seleniumjenkins.atlassian.net/",
//		  creds);
//		  
//		  //RestClient restClient = new RestClient(null, creds, null) try {
//		  
//		  SearchResult searchResult=jira.searchIssues("project='MavenProject'");
//		  //SearchResult searchResult=jira.
//		  ///searchIssues("project = \"MavenProject\" AND fixVersion = \"Unscheduled\" AND cycleName = \"MavenProject\""
//		  ); //System.out.println(searchResult.issues); 
//		  List<Issue> listOfIssues =searchResult.issues; 
//		  for(Issue issue:listOfIssues) {
//			  System.out.println("Issue in cycle:-->"+issue); 
//		  } //issue. //List<String>
//		  str=(List<String>) jira.getRestClient().post("https://seleniumjenkins.atlassian.net/rest/zapi/latest/execution?projectId=\"MAV\""); 
//		  //System.out.println("Project::"+str.toString());
//		  
//		  } catch (Exception e) { // TODO Auto-generated catch block
//		  //e.printStackTrace(); } }
//		  
//		  @Test public void zapiTest() { System.out.println("Zapi actions");
//		  
//		  
//		  
//		  //CZApiExecutions exe= CZApiClient.Search.
//		  getExecutions("project = \"MavenProject\" AND fixVersion = \"+\"Unscheduled\"+\" AND cycleName = \"MavenProject\""
//		  ); //System.out.println("exe"+exe.toString()); }
//		  
//		  @Test public void launchAndCloseBrowser() {
//		  System.out.println("Welcome launchAndCloseBrowser test");
//		  System.setProperty("webdriver.chrome..driver",
//		  "E:\\Drivers\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
//		  driver.get("https://www.google.co.in"); driver.manage().window().maximize();
//		  driver.findElement(By.name("q")).sendKeys("Jenkins Pipeline",Keys.ENTER);
//		  driver.quit(); }
//		  
//		  
//		  }
//		 