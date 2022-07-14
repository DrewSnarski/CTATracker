pipeline {
    agent any
  stages {
        
    stage('Build App') {
            steps {
             
                script {
                        sh 'chmod +x gradlew'
                         sh './gradlew assembleDebug'          
                }
            }
        }
  }
}
