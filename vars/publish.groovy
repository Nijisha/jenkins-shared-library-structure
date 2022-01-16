def call(opts) {
   pipeline {
       agent any
     stage{
  stage('Build') {
    steps{
  echo "env is ${env.MAIN_SEDM}"
            sh  echo ${env.MAIN_SEDM}
    }}}
   }}
