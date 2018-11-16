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
        stage('Run Latest Docker Image On EC2') {
            steps {
                sh 'ssh -i jenkins.pem ubuntu@18.222.87.31 \'docker stop $(docker ps -a -q) && docker run -d -p 8080:8096 ahujar/cricket-api:latest\''
            }
        }
        }
}
