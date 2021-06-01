

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
}