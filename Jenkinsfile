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
       jiraJqlSearch jql: 'project = "MavenProject" AND fixVersion = "Unscheduled" AND cycleName = "MavenProject"', site: ''
      //echo "${key}"
  }
}
