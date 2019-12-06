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

                            sh 'curl -o aws-iam-authenticator https://amazon-eks.s3-us-west-2.amazonaws.com/1.14.6/2019-08-22/bin/linux/amd64/aws-iam-authenticator'

                            sh 'chmod +x ./aws-iam-authenticator'

                            sh 'mkdir -p $HOME/bin && cp ./aws-iam-authenticator $HOME/bin/aws-iam-authenticator && export PATH=$HOME/bin:$PATH'

                            sh 'echo 'export PATH=$HOME/bin:$PATH' >> ~/.bashrc'
                            sh 'aws-iam-authenticator help'
                            sh 'aws eks --region us-east-1 update-kubeconfig --name EKS-cluster-pravin'
                            sh 'kubectl version --short --client'
                            sh 'kubectl apply -f .'
                          }

                       }
            }
  }

}