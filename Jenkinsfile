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
                
				def workspace = WORKSPACE
				echo ${workspace} 

				workspace = env.WORKSPACE
				echo ${workspace} 

				
				echo "Current workspace is ${env.WORKSPACE}"


				echo "Current workspace is $WORKSPACE"
            }
        }
     }   	
}