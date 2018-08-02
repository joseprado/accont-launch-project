package br.com.legado.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountLaunch {

	@JsonProperty("totalControleLancamento")
	private TotalControlLaunch totalControl;
	
	@JsonProperty("listaControleLancamento")
	private List<LaunchControl> listLaunchControl;
	
	@JsonProperty("indice")
	private Integer index;
	
	@JsonProperty("tamanhoPagina")
	private Integer pageSize;
	
	@JsonProperty("totalElements")
	private Integer totalElements;

	public TotalControlLaunch getTotalControl() {
		return totalControl;
	}

	public void setTotalControl(TotalControlLaunch totalControl) {
		this.totalControl = totalControl;
	}

	public List<LaunchControl> getListLaunchControl() {
		return listLaunchControl;
	}

	public void setListLaunchControl(List<LaunchControl> listLaunchControl) {
		this.listLaunchControl = listLaunchControl;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	
	
	
}
