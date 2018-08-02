package br.com.legado.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LaunchControl {

	@JsonProperty("lancamentoContaCorrenteCliente")
	private LaunchAccountEC launchAccount;
	
	@JsonProperty("dataEfetivaLancamento")
	private Date effectiveDateLaunch;
	
	@JsonProperty("dataLancamentoContaCorrenteCliente")
	private Date launchDateAccountEc;
	
	@JsonProperty("numeroEvento")
	private Long eventNumber;
	
	@JsonProperty("descricaoGrupoPagamento")
	private String paymentGroupDescription;
	
	@JsonProperty("codigoIdentificadorUnico")
	private Integer indentifierCode;
	
	@JsonProperty("nomeBanco")
	private String bankName;
	
	@JsonProperty("quantidadeLancamentoRemessa")
	private Integer launchShippingAmount;
	
	@JsonProperty("numeroRaizCNPJ")
	private Long rootCnpjNumber;
	
	@JsonProperty("numeroSufixoCNPJ")
	private Long sufixCnpjNumber;
	
	@JsonProperty("valorLancamentoRemessa")
	private Double launchShippingValue;
	
	@JsonProperty("dateLancamentoContaCorrenteCliente")
	private Date dateLaunchAccountEC;
	
	@JsonProperty("dateEfetivaLancamento")
	private Date dateEffectivateLaunch;
	
	public LaunchAccountEC getLaunchAccount() {
		return launchAccount;
	}
	public void setLaunchAccount(LaunchAccountEC launchAccount) {
		this.launchAccount = launchAccount;
	}
	public Date getEffectiveDateLaunch() {
		return effectiveDateLaunch;
	}
	public void setEffectiveDateLaunch(Date effectiveDateLaunch) {
		this.effectiveDateLaunch = effectiveDateLaunch;
	}
	public Date getLaunchDateAccountEc() {
		return launchDateAccountEc;
	}
	public void setLaunchDateAccountEc(Date launchDateAccountEc) {
		this.launchDateAccountEc = launchDateAccountEc;
	}
	public Long getEventNumber() {
		return eventNumber;
	}
	public void setEventNumber(Long eventNumber) {
		this.eventNumber = eventNumber;
	}
	public String getPaymentGroupDescription() {
		return paymentGroupDescription;
	}
	public void setPaymentGroupDescription(String paymentGroupDescription) {
		this.paymentGroupDescription = paymentGroupDescription;
	}
	public Integer getIndentifierCode() {
		return indentifierCode;
	}
	public void setIndentifierCode(Integer indentifierCode) {
		this.indentifierCode = indentifierCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Integer getLaunchShippingAmount() {
		return launchShippingAmount;
	}
	public void setLaunchShippingAmount(Integer launchShippingAmount) {
		this.launchShippingAmount = launchShippingAmount;
	}
	public Long getRootCnpjNumber() {
		return rootCnpjNumber;
	}
	public void setRootCnpjNumber(Long rootCnpjNumber) {
		this.rootCnpjNumber = rootCnpjNumber;
	}
	public Long getSufixCnpjNumber() {
		return sufixCnpjNumber;
	}
	public void setSufixCnpjNumber(Long sufixCnpjNumber) {
		this.sufixCnpjNumber = sufixCnpjNumber;
	}
	public Double getLaunchShippingValue() {
		return launchShippingValue;
	}
	public void setLaunchShippingValue(Double launchShippingValue) {
		this.launchShippingValue = launchShippingValue;
	}
	public Date getDateLaunchAccountEC() {
		return dateLaunchAccountEC;
	}
	public void setDateLaunchAccountEC(Date dateLaunchAccountEC) {
		this.dateLaunchAccountEC = dateLaunchAccountEC;
	}
	public Date getDateEffectivateLaunch() {
		return dateEffectivateLaunch;
	}
	public void setDateEffectivateLaunch(Date dateEffectivateLaunch) {
		this.dateEffectivateLaunch = dateEffectivateLaunch;
	}
	
	
	
}
