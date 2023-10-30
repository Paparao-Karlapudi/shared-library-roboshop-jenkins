def call() {
    pipeline {
        agent {
            label 'iteration-1'
        }

        stages {
            stage('Compile/Build') {
                steps {
                    sh 'echo compile'
                }
            }
        }
    }
}