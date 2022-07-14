pipeline {
    agent any
  stages {
        
    stage('Build App') {
            steps {
                permission{
                     git update-index --chmod=+x gradlew
                }
                script {
                   
                         sh './gradlew assembleDebug'          
                }
            }
        }
  }
}
