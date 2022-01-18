def call(opts) {
   pipeline {
       agent any
     stage{
  stage('Build') {
    steps{
  echo "env is ${env.projectName}"
            sh  echo ${env.projectName}
    }}}
   }}
