pipeline {
   agent any

  // tools {
      // Install the Maven version configured as "M3" and add it to the path.
   //   maven "mvn3_6"
   //}

   stages {

    stage('Checkout') {

        git 'https://github.com/sridharkidambi/Spring-Boot-REST.git'
       }
      stage('Build') {


         steps {

            withMaven(maven: 'mvn3_6'){
                sh 'mvn clean install  -X'
            }

         }
      }
   }
}