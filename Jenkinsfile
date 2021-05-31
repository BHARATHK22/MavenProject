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
                // now you are on slave labeled with 'label'
				def workspace = WORKSPACE
				echo ${workspace} //will now contain an absolute path to job workspace on slave

				workspace = env.WORKSPACE
				echo ${workspace} //will still contain an absolute path to job workspace on slave

				// When using a GString at least later Jenkins versions could only handle the env.WORKSPACE variant:
				echo "Current workspace is ${env.WORKSPACE}"

				// the current Jenkins instances will support the short syntax, too:
				echo "Current workspace is $WORKSPACE"
            }
        }
     }   	
}