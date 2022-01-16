def call(opts) {
  stage('Build') {
    steps{
  echo "env is ${env.MAIN_SEDM}"
            sh  echo ${env.MAIN_SEDM}
    }}
}
