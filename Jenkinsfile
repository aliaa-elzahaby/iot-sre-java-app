pipeline {
    agent any

    environment {
        IMAGE_NAME = "iot-sre-java-app"
        DEPLOY_DIR = "iot-sre-java-app"  // This is the nested directory with Dockerfile, etc.
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'develop', url: 'https://github.com/aliaa-elzahaby/iot-sre-java-app.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                dir("${DEPLOY_DIR}") {
                    bat "docker build -t ${IMAGE_NAME} ."
                }
            }
        }

        // Optional: Docker Push / AWS deploy logic here

        stage('Deploy') {
            when {
                branch 'master'
            }
            steps {
                echo 'Deploying to Staging (STG) because this is the master branch'
                // Add Helm or kubectl here if needed
            }
        }

        stage('Deploy to Test') {
            when {
                branch 'develop'
            }
            steps {
                echo 'Deploying to Test because this is the develop branch'
                // Add kubectl / Helm to test environment here
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
