pipeline {
    agent any

    environment {
        GRADLE_OPTS = "-Dorg.gradle.daemon=false"
    }

    stages {
        stage('Checkout') {
            steps {
                echo '📥 Checking out source code...'
                git branch: 'main', url: 'https://github.com/AshrutSharma/CICD-project3.git'
            }
        }

        stage('Clean') {
            steps {
                echo '🧹 Cleaning previous builds...'
                sh './gradlew clean'
            }
        }

        stage('Build') {
            steps {
                echo '🏗️ Building the project...'
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                echo '🧪 Running unit tests...'
                sh './gradlew test'
            }
        }
    }
    post {
        success {
            echo '✅ Build and tests completed successfully!'
        }
        failure {
            echo '❌ Build or tests failed.'
        }
    }
}
