def call(Map message) {
    echo "before changing"
    echo (currentBuild.projectName)
    item = Jenkins.instance.getItemByFullName((currentBuild.projectName))
    des = item.getDescription()
    echo des
    item.setDescription("This description was changed by script")
    
    item.save()
    item.renameTo(message.JOB_BASE_NAME)
    


    jobName([        
        (currentBuild.projectName): [[(currentBuild.projectName):  message.JOB_BASE_NAME ]]
    ])
    echo "after changing"
    echo (currentBuild.projectName)
    
  }
