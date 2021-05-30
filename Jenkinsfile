pipeline {
    agent any
    environment{
        NEW_VERSION='1.3.0' 
        def readTestCases ="E:\\eclipse-workspace\\MavenProject\\InputFiles\\"
        def testCase=""
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Java project') {
            steps {
                sh "mvn package exec:java"
            }
        }
        stage('test project') {
            steps {
                sh "mvn test"
            }
        }
        stage('read') {
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
}