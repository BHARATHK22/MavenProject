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
                 
                  			readFile("E:\\eclipse-workspace\\MavenProject\\InputFiles\\TestRunner.csv").eachLine { line, count ->
                            def fields = line.split(',')
                            
                            for(String item: fields) {
                                println item
                                println ' you are parsing line : ' + count
                   }
                   
                  
                 }
              }
            }
    }
}