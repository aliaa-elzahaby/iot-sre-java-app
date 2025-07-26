pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        checkout scm
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
    stage('Deploy to Dev') {
      steps {
        echo 'Deploying to Dev...'
        sh 'docker-compose up -d --build'
      }
    }
    stage('Deploy to Test') {
      when { expression { currentBuild.currentResult == 'SUCCESS' } }
      steps {
        echo 'Deploying to Test...'
        // Add relevant commands for Test
      }
    }
    stage('Deploy to STG') {
      when { branch 'main' }
      steps {
        echo 'Deploying to STG...'
        // deploy staging: could push Docker image, run helm/k8s etc.
      }
    }
  }
}
