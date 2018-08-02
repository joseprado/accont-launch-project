package br.com.legado.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DomicilieBank {
	
	@JsonProperty("codigoBanco")
	private Integer banckCode;
	
	@JsonProperty("numeroAgencia")
	private Integer agencyNumber;
	
	@JsonProperty("numeroContaCorrente")
	private Integer accountNumber;
	
	public Integer getBanckCode() {
		return banckCode;
	}
	public void setBanckCode(Integer banckCode) {
		this.banckCode = banckCode;
	}
	public Integer getAgencyNumber() {
		return agencyNumber;
	}
	public void setAgencyNumber(Integer agencyNumber) {
		this.agencyNumber = agencyNumber;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	

}
