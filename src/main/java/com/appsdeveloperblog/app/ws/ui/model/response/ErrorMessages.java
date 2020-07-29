package com.appsdeveloperblog.app.ws.ui.model.response;

public enum ErrorMessages {
     
	MISSING_REQUIRED_FIELD("Missing Required Field.Please Check Documentation For Required Field"),
	RECORD_ALREADY_EXISTS("Record Already Exists"),
	INTERNAL_SERVER_ERROR("Internal Server Error"),
	NO_RECORD_FOUND("Record With Provided Id is not Found"),
	AUTHENTICATION_FAILED("Athentication failed"),
	COULD_NOT_UPDATE_RECORD("Could not Update Record"),
	COULD_NOT_DELETE_RECORD("Could not Delete Record"),
	EMAIL_ADDRESS_NOT_VARIFIED("Email Address could not be verified");
	
	
	private String errorMessage;
	  
	ErrorMessages(String errorMessage){
		this.errorMessage=errorMessage;
	}
	
	public String getErrorMessage() {
		
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage=errorMessage; 
	}
	
}
