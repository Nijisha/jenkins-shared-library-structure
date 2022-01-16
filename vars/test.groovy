vars
| --- welcomeJob.groovy
| --- jenkinsForJava.groovy
| --- jenkinsLambdaTest.groovy

def call(String repoUrl) {
   pipeline{
       agent any
       
       environment {
           MAIN_SEDM = ${env.MAIN_SEDM}
       }
       stages {
           stage("Tools initialization") {
               steps {
                       sh echo $MAIN_SEDM}
                   }
               }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                   url: "${repoUrl}"
               }
           }
           
       }
   }
}
