pipeline {
   agent any

  // tools {
      // Install the Maven version configured as "M3" and add it to the path.
   //   maven "mvn3_6"
   //}

   stages {

    stage('Checkout') {
         steps {
        git 'https://github.com/sridharkidambi/Spring-Boot-REST'

        }
       }
      stage('Build') {


         steps {

            withMaven(maven: 'mvn3_6'){
                sh 'mvn -version'
                sh 'ls -latr'
                sh 'mvn clean '
            }

         }
      }
   }
}