def call() {
    pipeline {
        agent {
            label 'iteration-1'
        }

        stages {
            stage('Compile/Build') {
                steps {
                    script{
                        common.compile
                    }
                }
            }

            stage('Unit Testing') {
                steps {
                    echo 'Unit Testing'
                }
            }

            stage('Quality cntrol') {
                steps {
                    echo 'Quality of code'
                }
            }

            stage('Keeping repo at central location') {
                steps {
                    echo 'Pushing repo to central location'
                }
            }

        }
    }

}