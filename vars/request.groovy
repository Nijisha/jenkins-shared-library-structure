def call(Map params) {
	def requestContent = new StringBuilder()
    process([
	    json.append("""{ "applicationCode": "params.applicationCode", "applBranchName": "params.applBranchName", "changemanPackageNumber": "params.changemanPackageNumber", "gexxBranchName": "params.gexxBranchName", "userid": "params.userid", "callbackURL": "params.callbackURL" },""");
	    echo "requestBody="
	    echo (requestContent.toString())
        
    ])
    
  }
