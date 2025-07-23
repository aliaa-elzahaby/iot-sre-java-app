pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/aliaa-elzahaby/iot-sre-java-app.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        // Add your deploy stages here, example:
        stage('Deploy to Dev') {
            steps {
                echo 'Deploying to Dev environment...'
                // Your deploy script/commands here
            }
        }
    }
}
