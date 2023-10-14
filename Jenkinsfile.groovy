pipeline {
    agent {
        docker {
            image 'node:16' // Use Node 16 Docker image
            args '-v /var/run/docker.sock:/var/run/docker.sock' // Required for Docker-in-Docker (DinD)
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'npm install --save'
            }
        }
    }
}
