pipeline {
    agent {
        // Run on a build agent where we have the Android SDK installed
        label 'android'
    }
  stages {
        stage('Start Build') {
            steps {
                bitbucketStatusNotify(buildState: 'INPROGRESS')
            }
        }
    stage('Build App') {
            steps {
                // Clean and assemble APKs
                sh './gradlew clean assembleDebug assembleRelease'

                script {
                    if (env.BRANCH_NAME.startsWith("release")) {
                        sh './gradlew bundleUpload'
                    }
                }
            }
        }
  }
}
