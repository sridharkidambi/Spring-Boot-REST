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
                    script {
                     def customImage = docker.build("sridharkidambi/skimages")
                     docker.withRegistry('https://registry.hub.docker.com/','dockerhub'){
                        customImage.push()
                      }
                    }

                 }
      }

      stage('Deploy to K8s') {
                       steps {
                          script {
                           sh 'ls -latr'
                           # sh 'kubectl apply -f  Spring-Boot-REST/ '
                          }

                       }
            }
  }

}