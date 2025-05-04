pipeline {
    agent any

    environment {
        // Optional: Set environment variables if needed
        GRADLE_OPTS = "-Dorg.gradle.daemon=false"
    }

    tools {
        // Use Jenkins-installed JDK and Gradle (or use wrapper)
        jdk 'Java 17'       // Adjust to your Jenkins JDK name
        gradle 'Gradle 8'   // Or use gradlew wrapper
    }

    stages {
        stage('Checkout') {
            steps {
                echo '📥 Checking out source code...'
                git branch: 'main', url: 'https://github.com/AshrutSharma/CICD-Project3.git'
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
