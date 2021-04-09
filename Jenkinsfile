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
    }
}
node {
  stage('JIRA') {
       def key= jiraGetIssue idOrKey: '', site: 'JIRA'
      echo "${key}"
  }
}
