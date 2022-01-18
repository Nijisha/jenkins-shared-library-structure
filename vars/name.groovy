def call(Map message) {

    jobName([        
        projectName: [[projectName:  message.JOB_BASE_NAME ]]
    ])
  }
