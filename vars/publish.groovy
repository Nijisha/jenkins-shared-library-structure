def call(opts) {
  stage('Build') {
  echo "env is ${env.MAIN_SEDM}"
             sh  echo ‘docker build'
        }
}
