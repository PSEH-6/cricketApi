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
                sh 'docker build . -t ahujar/cricket-api:latest'
                sh 'docker login -p Github@123 -u ahujar && docker push ahujar/cricket-api:latest'
            }
        }
        }
}
