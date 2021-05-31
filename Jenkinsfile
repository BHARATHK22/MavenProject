pipeline {
    agent any
    environment{
        NEW_VERSION='1.3.0' 
        def readTestCases ="E:\\eclipse-workspace\\MavenProject\\InputFiles\\"
        def testCase=""
        def scriptDir = getClass().protectionDomain.codeSource.location.path
    }
    stages {
       /* stage('Simple print Project') {
            steps {
                echo 'Hello World'
            }
        }
       */ 
        stage('Java project') {
            steps {
                //sh "mvn package exec:java"
                
                println scriptDir
            }
        }
       /* stage('test project') {
            steps {
                sh "mvn test"
            }
        }
       */ 
        /*stage('read') {
                steps {
                 script {
                 
                  			def lines=readFile("E:\\eclipse-workspace\\MavenProject\\InputFiles\\TestRunner.csv").readLines()
                  			lines.each{String testCase ->
  							println 'TestCase::'+testCase
  							
  							//data = "${readTestCases}TestRunner.csv"
                  			jiraUploadAttachment idOrKey: "${testCase}", file: 'C:\\Users\\Dell\\.jenkins\\workspace\\GitPipeline\\target\\surefire-reports\\emailable-report.html', site: 'JIRA'
  							
							}
                 }
              }
            }
            
		}
		*/
}