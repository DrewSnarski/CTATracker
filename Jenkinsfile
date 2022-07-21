pipeline {
    agent any
  stages {
      stage ('Test App'){
          steps{
            script{
                     sh 'chmod +x gradlew'
                     sh './gradlew test'
            }
          }
      }
    stage('Build App') {
            steps {
                script {
                        sh 'chmod +x gradlew'
                         sh './gradlew assembleDebug'          
                }
            }
        }
      stage('Deploy') {
            steps {
                script {
                    echo 'Deploying Android APK to GitHub Release Tab...'
                    sh '/home/vagrant/sample-app-release-script.sh'
                }
            }
        }
  }
}
