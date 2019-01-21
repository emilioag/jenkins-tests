@Library('utils') _

pipeline {
    agent {
        docker { image 'groovy:2.5' }
    }
    stages {
        stage('Code steps') {
            parallel {
                stage('Format') {
                    agent {
                        docker { image 'groovy:2.5' }
                    }
                    steps {
                        script {
                            sh code.format(["lang": "cpp"])
                        }
                    }
                }
                stage('Check') {
                    agent {
                        docker { image 'groovy:2.5' }
                    }
                    steps {
                        script { 
                            sh code.check(["lang": "cpp"])
                        }
                    }
                }
                stage('Build') {
                    agent {
                        docker { image 'groovy:2.5' }
                    }
                    steps {
                        script { 
                            sh code.build(["lang": "cpp"])
                        }
                    }
                }
                stage('Test') {
                    agent {
                        docker { image 'groovy:2.5' }
                    }
                    steps {
                        script { 
                            sh code.test(["lang": "cpp"])
                        }
                    }
                }
                stage('Coverage') {
                    agent {
                        docker { image 'groovy:2.5' }
                    }
                    steps {
                        script { 
                            sh code.coverage(["lang": "cpp"])
                        }
                    }
                }
                stage('Docgen') {
                    agent {
                        docker { image 'groovy:2.5' }
                    }
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
