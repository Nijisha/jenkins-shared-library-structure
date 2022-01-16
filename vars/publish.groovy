import jenkins.model.*
jenkins = Jenkins.instance
def call(opts) {
  stage('Build') {
  sh echo "env is ${env.MAIN_SEDM}"
            sh  echo ${env.MAIN_SEDM}
        }
}
