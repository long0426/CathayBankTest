package com.cathaybank.test.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CurrentPrice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6541705226053432279L;
	private Date updateTime;
	private List<Price> priceList;

	@Override
	public String toString() {
		return "CurrentPrice [updateTime=" + updateTime + ", priceList=" + priceList + "]";
	}

	@JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<Price> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<Price> priceList) {
		this.priceList = priceList;
	}
}
