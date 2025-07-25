pipeline {
  agent any

  stages {
    stage('Checkout') {
      steps {
        git branch: 'develop',
            url: 'https://github.com/aliaa-elzahaby/iot-sre-java-app.git'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean package -DskipTests'
      }
    }

    stage('Docker Build') {
      steps {
        bat 'docker build -t iot-sre-java-app .'
      }
    }

    stage('Docker Compose') {
      steps {
        bat  'docker-compose up -d'
      }
    }
  }
}
