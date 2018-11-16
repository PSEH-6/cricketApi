pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
            }
        stage('build and Upload Docker Image') {
            steps {
                sh 'docker build . -t cricket-api:latest'
                sh 'docker push cricket-api:latest'
            }
        }
        }
}
