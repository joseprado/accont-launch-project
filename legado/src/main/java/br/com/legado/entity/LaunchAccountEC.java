package br.com.legado.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LaunchAccountEC {

	@JsonProperty("numeroRemessaBanco")
	private Long shippingBankNumber;
	
	@JsonProperty("nomeSituacaoRemessa")
	private String situationShippingName;
	
	@JsonProperty("dadosDomicilioBancario")
	private DomicilieBank domicilie;
	
	@JsonProperty("nomeTipoOperacao")
	private String typeOperationName;
	
	public Long getShippingBankNumber() {
		return shippingBankNumber;
	}
	public void setShippingBankNumber(Long shippingBankNumber) {
		this.shippingBankNumber = shippingBankNumber;
	}
	public String getSituationShippingName() {
		return situationShippingName;
	}
	public void setSituationShippingName(String situationShippingName) {
		this.situationShippingName = situationShippingName;
	}
	public DomicilieBank getDomicilie() {
		return domicilie;
	}
	public void setDomicilie(DomicilieBank domicilie) {
		this.domicilie = domicilie;
	}
	public String getTypeOperationName() {
		return typeOperationName;
	}
	public void setTypeOperationName(String typeOperationName) {
		this.typeOperationName = typeOperationName;
	}
	
	
	
}
