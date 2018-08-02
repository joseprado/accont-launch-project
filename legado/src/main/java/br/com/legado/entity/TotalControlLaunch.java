package br.com.legado.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalControlLaunch {
	
	@JsonProperty("quantidadeLancamentos")
	private Integer launchAmount;
	
	@JsonProperty("quantidadeRemessas")
	private Integer ShippingAmount;
	
	@JsonProperty("valorLancamentos")
	private Double launchValue;

	public Integer getLaunchAmount() {
		return launchAmount;
	}

	public void setLaunchAmount(Integer launchAmount) {
		this.launchAmount = launchAmount;
	}

	public Integer getShippingAmount() {
		return ShippingAmount;
	}

	public void setShippingAmount(Integer shippingAmount) {
		ShippingAmount = shippingAmount;
	}

	public Double getLaunchValue() {
		return launchValue;
	}

	public void setLaunchValue(Double launchValue) {
		this.launchValue = launchValue;
	}
	
	
}
