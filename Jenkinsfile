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
                   
                  //data = readFile(file: "${readTestCases}TestRunner.csv")
                  //jiraUploadAttachment idOrKey: "${data}", file: 'C:\\Users\\Dell\\.jenkins\\workspace\\GitPipeline\\target\\surefire-reports\\emailable-report.html', site: 'JIRA'
                  //println(data)
                 }
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
