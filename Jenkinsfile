pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Deploy to Dev') {
            steps {
                echo 'Deploying to Dev environment...'
                // Add AWS CLI or Helm commands here
            }
        }
        stage('Deploy to Test') {
            when {
                expression { currentBuild.currentResult == 'SUCCESS' }
            }
            steps {
                echo 'Deploying to Test environment...'
            }
        }
        stage('Deploy to STG') {
            when {
                branch 'main'
            }
            steps {
                echo 'Deploying to STG environment...'
            }
        }
    }
}
