package com.wellsfargo.batch7.group5.ibs.service;

import java.util.List;

import com.wellsfargo.batch7.group5.ibs.exception.IBSExceptionHandler;
import com.wellsfargo.batch7.group5.ibs.model.CustomerNewPasswordForgetModel;
import com.wellsfargo.batch7.group5.ibs.model.CustomerNewPasswordModel;
import com.wellsfargo.batch7.group5.ibs.model.KycDetailsModel;
import com.wellsfargo.batch7.group5.ibs.model.SetSecurityQuestionModel;


public interface IpasswordChange 
{
	
	
	
	Boolean firstTimePasswordChange(String uci) throws IBSExceptionHandler;
	void changePassword(CustomerNewPasswordModel  customerNewPasswordModel,String uci ) throws IBSExceptionHandler;
	void changePasswordForget(CustomerNewPasswordForgetModel  customerNewPasswordForgetModel ) throws IBSExceptionHandler;
	
	void setSecQAnAns(SetSecurityQuestionModel setSecurityQuestionModel,String uci)  throws IBSExceptionHandler;
	

}
