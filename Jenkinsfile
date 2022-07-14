pipeline {
    agent any
  stages {
        
    stage('Build App') {
            steps {
             
                script {
                   
                         sh './gradlew assembleDebug'          
                }
            }
        }
  }
}
