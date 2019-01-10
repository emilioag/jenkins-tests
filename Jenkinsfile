pipeline {
    agent none
    stages {
        stage('Code steps') {
            parallel {
                stage('Format') {
                    agent any
                    steps {
                        sh 'echo "Format code"'
                    }
                }
                stage('Check') {
                    agent any
                    steps {
                        sh 'echo "Check"'
                    }
                }
                stage('Build') {
                    agent any
                    steps {
                        sh 'echo "Build"'
                    }
                }
                stage('Test') {
                    agent any
                    steps {
                        sh 'echo "Test"'
                    }
                }
                stage('Coverage') {
                    agent any
                    steps {
                        sh 'echo "Coverage"'
                    }
                }
                stage('Docgen') {
                    agent any
                    steps {
                        sh 'echo "Docgen"'
                    }
                }
            }
        }
    }
}
