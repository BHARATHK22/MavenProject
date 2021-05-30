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
                  File csvFile = new File("E:\eclipse-workspace\MavenProject\InputFiles\TestRunner.csv")
                  def csv_content = csvFile.getText('utf-8')
  				  def data_iterator = parseCsv(csv_content, separator: ';', readFirstLine: true)
  				  
  				  for (line in data_iterator) {
   						 println (data_iterator)
				  }
 
                  //data = readFile(file: "${readTestCases}TestRunner.csv")
                  //jiraUploadAttachment idOrKey: "${data}", file: 'C:\\Users\\Dell\\.jenkins\\workspace\\GitPipeline\\target\\surefire-reports\\emailable-report.html', site: 'JIRA'
                  println(data)
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
