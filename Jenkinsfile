pipeline {
    agent any
  stages {
        
    stage('Build App') {
            steps {
                script {
                        sudo sh './gradlew bundleUpload'          
                }
            }
        }
  }
}
