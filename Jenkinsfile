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
        dir('iot-sre-java-app') {
          sh 'docker build -t hello-world-app .'
        }
      }
    }

    stage('Docker Compose') {
      steps {
        dir('iot-sre-java-app') {
          sh 'docker-compose up -d'
        }
      }
    }
  }
}
