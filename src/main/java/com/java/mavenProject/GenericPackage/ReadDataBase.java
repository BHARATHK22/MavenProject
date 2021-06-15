package com.java.mavenProject.GenericPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.testng.annotations.Test;

public class ReadDataBase {
	@Test
	public void readDataBaseMethod() {
		String dataBaseName="Credentials";
		 
		 try{  
			 Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection= DriverManager.getConnection("jdbc:ucanaccess://E:\\Tables\\ClientDatabase.accdb");
            System.out.println("Connected Successfully"); 
            PreparedStatement preparedStatement=connection.prepareStatement("select top 1 * from "+dataBaseName+" order by rnd()");
            
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                 String UserName=resultSet.getString("UserName");
                 String Password=resultSet.getString("Password");
                
                 System.out.println("UserName::"+UserName);
                 System.out.println("Password::"+Password);
            }
		  
		}catch(Exception ee){
			System.out.println(ee);}  
		  
	}
	

}
