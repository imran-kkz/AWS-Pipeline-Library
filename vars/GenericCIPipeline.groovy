// add imports 

def call(body){
    def config [:]
    def builder
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    pipeline{
        agent any{
            tools {
                jdk 'jdk1.8.0_181'
            }
            environment {
                // add ENV VARS here
            }
            stages {
                stage('Init'){
                    steps {
                        echo ("start stage here")
                        script {
                            // enter sh cmds here
                        }
                    }
                }
                stage('Code Checkout'){
                    steps {
                        //steps for code checkout
                    }
                }
                stage('Build and Test'){
                    steps {
                        echo ("steps for build and test here")
                        script {
                            //enter sh cmds here
                        }
                    }
                }
                stage('Security Scan')
            }
        }
    }
}