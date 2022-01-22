def call(Map params) {
	def requestContent = new StringBuilder()
	applicationCode = params.applicationCode
	applBranchName = params.applBranchName
	changemanPackageNumber = params.changemanPackageNumber
	gexxBranchName = params.gexxBranchName
	userid = params.userid
	callbackURL = params.callbackURL
	echo "got details=="
	echo applicationCode
	echo applBranchName
	echo changemanPackageNumber
	echo gexxBranchName
	echo userid
	echo callbackURL
	echo applicationCode
	process([
	   requestContent.append("""{ "applicationCode": "$applicationCode", """)
	   requestContent.append(""""applBranchName": "$applBranchName", """) 
	   requestContent.append(""""changemanPackageNumber": "$changemanPackageNumber", """)
	    requestContent.append("""""gexxBranchName": "$gexxBranchName", """) 
	    requestContent.append("""""userid": "$userid", """)
	    requestContent.append("""""callbackURL": "$callbackURL" }""");
	      
        
    ])
   echo "requestBody="
   echo (requestContent.toString())
    
  }
