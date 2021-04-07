pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('test project') {
            steps {
                sh "mvn test"
            }
        }
    }
}
