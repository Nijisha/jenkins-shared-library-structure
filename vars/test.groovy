def call(String repoUrl) {
   pipeline{
       agent any
       
       environment {
           MAIN_SEDM = "${env.MAIN_SEDM}"
       }
       stages {
           stage("Tools initialization") {
               steps {
                    echo $MAIN_SEDM}
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
