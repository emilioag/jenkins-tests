@Library('utils') _

pipeline {
    agent none
    stages {
        stage('Code steps') {
            parallel {
                stage('Format') {
                    agent any
                    steps {
                        script {
                            sh code.format(["lang": "cpp"])
                        }
                    }
                }
                stage('Check') {
                    agent any
                    steps {
                        script { 
                            sh code.check(["lang": "cpp"])
                        }
                    }
                }
                stage('Build') {
                    agent any
                    steps {
                        script { 
                            sh code.build(["lang": "cpp"])
                        }
                    }
                }
                stage('Test') {
                    agent any
                    steps {
                        script { 
                            sh code.test(["lang": "cpp"])
                        }
                    }
                }
                stage('Coverage') {
                    agent any
                    steps {
                        script { 
                            sh code.coverage(["lang": "cpp"])
                        }
                    }
                }
                stage('Docgen') {
                    agent any
                    steps {
                        script { 
                            sh code.docgen(["lang": "cpp"])
                        }
                    }
                }
            }
        }
    }
}
