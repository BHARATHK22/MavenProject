

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
				println "Workspace->"+workspace 

				def directory = pwd()
				println "Directory->"+directory
				
				//loadProperties()
				def filePath = "${workspace}/logTestcaseFolder/logTestCaseFile.properties"
				println "filePath-->"+filePath
				def props = readProperties  file: filePath
				
				println "sizeOfProperty-->"+props.size()
				println "0-->"+props['0']
				println "1-->"+props['1']
				
				
				def traditional_int_for_loop(list) {
    			println "echo Going to echo a list"
    			for (int i = 0; i < props.size(); i++) {
        			println "echo Hello ${props[i]}"
    				}
				}
				}
            }
        }
     }   	
}