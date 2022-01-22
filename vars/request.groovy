def call(Map params) {
	def requestContent = new StringBuilder()
    process([
		requestContent.append('{')
		requestContent.append("\"applicationCode\" : \"params.applicationCode\",")
		requestContent.append("\"applBranchName" : \"params.applBranchName\",")
		requestContent.append("\"changemanPackageNumber\" : \"params.changemanPackageNumber\",") 
		requestContent.append("\"gexxBranchName\" : \"params.gexxBranchName\",")    	            
		
		requestContent.append("\"userid\" : \"params.userid\",")
		requestContent.append("\"callbackURL\" : \"params.callbackURL\"}") 
						
		echo "requestBody requestContent.toString()"
        
    ])
    
  }
