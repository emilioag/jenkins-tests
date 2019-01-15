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
                            go.format({})
                        }
                    }
                }
                stage('Check') {
                    agent any
                    steps {
                        script { 
                            go.check({})
                        }
                    }
                }
                stage('Build') {
                    agent any
                    steps {
                        script { 
                            go.build({})
                        }
                    }
                }
                stage('Test') {
                    agent any
                    steps {
                        script { 
                            go.test({})
                        }
                    }
                }
                stage('Coverage') {
                    agent any
                    steps {
                        script { 
                            go.coverage({})
                        }
                    }
                }
                stage('Docgen') {
                    agent any
                    steps {
                        script { 
                            go.docgen({})
                        }
                    }
                }
            }
        }
    }
}
