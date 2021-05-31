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
				print "workspace"+workspace 

				workspace = env.WORKSPACE
				print "workspace"+workspace 

				def directory = pwd()
				print "directory->"+directory
				}
            }
        }
     }   	
}