def call(Map message) {

    jobName([        
        (currentBuild.projectName): [[(currentBuild.projectName):  message.JOB_BASE_NAME ]]
    ])
  }
