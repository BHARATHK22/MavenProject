pipeline {
    agent any
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
                 
                  			readFile("E:\\eclipse-workspace\\MavenProject\\InputFiles\\TestRunner.csv").eachLine { String line ->
                            println 'Test Case::'+line
                 }
              }
            }
			}
    }
}