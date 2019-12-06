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

                          sshagent(['jenkins']){
                            sh "scp -o StrictHostKeyChecking=no pods.yml services.yml  ec2-user@3.86.254.81:/home/ec2-user/"
                            script {
                                try{
                                sh 'ssh ec2-user@3.86.254.81 ls -latr'
                                sh 'ssh ec2-user@3.86.254.81 kubectl apply -f .'
                                }catch(error){
                                    sh 'ssh ec2-user@3.86.254.81 kubectl create -f .'
                                }
                            }
                          }

                       }
            }
  }

}