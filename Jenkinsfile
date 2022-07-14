pipeline {
    agent any
  stages {
        
    stage('Build App') {
            steps {
                script {
                    git update-index --chmod=+x gradlew
                         sh './gradlew assembleDebug'          
                }
            }
        }
  }
}
