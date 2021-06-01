

pipeline {
    agent any
    environment{
        NEW_VERSION='1.3.0' 
        def readTestCases ="E:\\eclipse-workspace\\MavenProject\\InputFiles\\"
        def testCase=""
        def scriptDir = "getClass().protectionDomain.codeSource.location.path"
    }
    stages {
        stage('Java project') {
            steps {
               script { 
				def workspace = WORKSPACE
				print "Workspace->"+workspace 

				def directory = pwd()
				print "Directory->"+directory
				
				//loadProperties()
				def filePath = "${workspace}/logTestcaseFolder/logTestCaseFile.properties"
				
				def props = readProperties  file: 'filePath'
				println "0-->"+props['0']
				println "1-->"+props['1']
				}
            }
        }
     }   	
}