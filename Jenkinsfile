pipeline {
    agent any
  stages {
        
    stage('Build App') {
            steps {
             
                script {
                        chmod +x gradlew
                         sh './gradlew assembleDebug'          
                }
            }
        }
  }
}
