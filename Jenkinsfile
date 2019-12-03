pipeline {
   agent any

   stages {

    stage('Checkout') {
         steps {
        git 'https://github.com/sridharkidambi/Spring-Boot-REST'

        }
       }
      stage('Build') {


         steps {

            withMaven(maven: 'mvn3_6'){
                sh 'mvn install '
            }

         }

      }

      stage('Unit Test') {


               steps {

                  withMaven(maven: 'mvn3_6'){
                      sh 'mvn test '
                  }

               }
      }

      stage('Build image & upload') {

                     steps {

                        withMaven(maven: 'mvn3_6'){
                            sh 'mvn clean install '
                        }

                     }
                     steps {

                            docker.withRegistry('https://hub.docker.com/','dockerhub_cred'){
                                def customImage=docker.build("sridharkidambi/skimages")
                                customImage.push()
                            }

                     }
      }
  }

}