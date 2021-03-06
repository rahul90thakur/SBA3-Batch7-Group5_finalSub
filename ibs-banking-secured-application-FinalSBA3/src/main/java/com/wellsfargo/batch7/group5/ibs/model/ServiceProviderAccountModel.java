package com.wellsfargo.batch7.group5.ibs.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


public class ServiceProviderAccountModel {


	private String serviceProviderId;
	private String serviceProviderName;
	private String bankName;
	private Long accountId;
	private String BranchName;
	private String ifscCode;
	private Double CurrentBalance;
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate svcStartDate;
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate svcEndDate;
	private KycDetailsModel ServiceProvider_Info; /// No need can be deleted, not used so far
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate createdDt;

	public ServiceProviderAccountModel() {
		
	}

	
	public ServiceProviderAccountModel(String serviceProviderId, String serviceProviderName, String bankName,
			Long accountId, String branchName, String ifscCode, Double currentBalance, LocalDate svcStartDate,
			LocalDate svcEndDate, KycDetailsModel serviceProvider_Info, LocalDate createdDt) {
		super();
		this.serviceProviderId = serviceProviderId;
		this.serviceProviderName = serviceProviderName;
		this.bankName = bankName;
		this.accountId = accountId;
		BranchName = branchName;
		this.ifscCode = ifscCode;
		CurrentBalance = currentBalance;
		this.svcStartDate = svcStartDate;
		this.svcEndDate = svcEndDate;
		ServiceProvider_Info = serviceProvider_Info;
		this.createdDt = createdDt;
	}
	
	


	public Double getCurrentBalance() {
		return CurrentBalance;
	}


	public void setCurrentBalance(Double currentBalance) {
		CurrentBalance = currentBalance;
	}


	public String getServiceProviderId() {
		return serviceProviderId;
	}

	public void setServiceProviderId(String serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	public String getServiceProviderName() {
		return serviceProviderName;
	}

	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public LocalDate getSvcStartDate() {
		return svcStartDate;
	}

	public void setSvcStartDate(LocalDate svcStartDate) {
		this.svcStartDate = svcStartDate;
	}

	public LocalDate getSvcEndDate() {
		return svcEndDate;
	}

	public void setSvcEndDate(LocalDate svcEndDate) {
		this.svcEndDate = svcEndDate;
	}

	public KycDetailsModel getServiceProvider_Info() {
		return ServiceProvider_Info;
	}

	public void setServiceProvider_Info(KycDetailsModel serviceProvider_Info) {
		ServiceProvider_Info = serviceProvider_Info;
	}

	public LocalDate getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(LocalDate createdDt) {
		this.createdDt = createdDt;
	}
	
	

}