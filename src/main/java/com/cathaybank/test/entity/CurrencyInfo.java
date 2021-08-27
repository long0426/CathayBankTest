package com.cathaybank.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "currencyinfo")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class CurrencyInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8550923909861083619L;

	private int id;
	
	private String code;
	
	private String name;
	
	public CurrencyInfo() {
	}

	public CurrencyInfo(String code, String name) {
		this.code = code;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "CODE")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
