def call(Map params) {
	def requestContent = new StringBuilder()
	applicationCode = params.applicationCode
	applBranchName = params.applBranchName
	changemanPackageNumber = params.changemanPackageNumber
	gexxBranchName = params.gexxBranchName
	userid = params.userid
	callbackURL = params.callbackURL
	
    process([
	    json.append("""{ "applicationCode": "$applicationCode", "applBranchName": "$applBranchName", "changemanPackageNumber": "$changemanPackageNumber", "gexxBranchName": "$gexxBranchName", "userid": "$userid", "callbackURL": "$.callbackURL" }""");
	    
        
    ])
   echo "requestBody="
   echo (requestContent.toString())
    
  }
