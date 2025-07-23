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
                dir('my-java-app') {        // <-- Change to the directory containing pom.xml
                    bat 'mvn clean package -DskipTests'  // Use bat for Windows Jenkins agents
                }
            }
        }
        stage('Test') {
            steps {
                dir('my-java-app') {
                    bat 'mvn test'
                }
            }
        }
        // Add deploy stages similarly with dir('my-java-app') if needed
    }
}
