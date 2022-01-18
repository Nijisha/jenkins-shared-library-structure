def call(Map message) {
    echo "before changing"
    echo (currentBuild.projectName)

    jobName([        
        (currentBuild.projectName): [[(currentBuild.projectName):  message.JOB_BASE_NAME ]]
    ])
    echo "after changing"
    echo (currentBuild.projectName)
    
  }
