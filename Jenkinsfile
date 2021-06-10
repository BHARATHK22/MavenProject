pipeline {
    agent any
    environment{
        NEW_VERSION='1.3.0' 
        def readTestCases ="E:\\eclipse-workspace\\MavenProject\\InputFiles\\"
        def testCase=""
        def scriptDir = "getClass().protectionDomain.codeSource.location.path"
        //def workspace = WORKSPACE
        
    }
    stages {
    
    	stage('Java project') {
            steps {
                sh "mvn exec:java"
            }
        }
        stage('mvn Testproject') {
            steps {
                sh "mvn test"
            }
        }
    
        stage('Jira project') {
            steps {
               script { 
				def workspace = WORKSPACE
				println "Workspace->"+workspace 

				def directory = pwd()
				println "Directory->"+directory
				
				
				def filePath = "${workspace}/logTestcaseFolder/logTestCaseFile.properties"
				println "filePath-->"+filePath
				def props = readProperties  file: filePath
				
				println "sizeOfProperty-->"+props.size()
				
				def testReportFolder= "${workspace}/Report/"
				
				Set<Object> keys = props.keySet();
    			
    			for (Object key:keys) {
        			println "Key  -->"+key
        			def value = props[key]
        			println "Value-->"+value
        			
        			def testCaseReportPath= testReportFolder+props[key]+".html"
        			println "testCaseReportPath-->"+testCaseReportPath     
        			
        			jiraUploadAttachment idOrKey: "${key}", file: testCaseReportPath, site: 'JIRA'
  								
   				}
			  }
            }
        }
     } 
     post {
        
        failure {
        	 mail to: 'bharathkalapakuri@gmail.com',
             subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Something is wrong with ${env.BUILD_URL}"
    	}
    	success {
        	 mail to: 'bharathkalapakuri@gmail.com',
             subject: "Project Report Success: ${currentBuild.fullDisplayName}",
             body: "Please find the report here ${env.BUILD_URL}"
    	}
    	always{
    		  steps{ 
    		  		emailext attachmentsPattern: "E:\eclipse-workspace\MavenProject\target\surefire-reports\emailable-report.html", body: '''${SCRIPT, template="groovy-html.template"}''', 
                    subject: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - Successful", 
                    mimeType: 'text/html',to: "bharathkalapakuri@gmail.com"
    		   		}
    		  }	
    }  	
}