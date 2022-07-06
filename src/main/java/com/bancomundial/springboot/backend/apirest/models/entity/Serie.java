package com.bancomundial.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="datalab2")

public class Serie implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="SERIES_NAME")
	private String name;
	@Column(name="SERIES_CODE")
	private String code;
	@Column(name="COUNTRY_NAME")
	private String countryName;
	@Column(name="COUNTRY_CODE")
	private String countryCode;
	@Column(name="AÑO2010")
	private String age2010;
	@Column(name="AÑO2011")
	private String age2011;
	@Column(name="AÑO2012")
	private String age2012;
	@Column(name="AÑO2013")
	private String age2013;
	@Column(name="AÑO2014")
	private String age2014;
	@Column(name="AÑO2015")
	private String age2015;
	@Column(name="AÑO2016")
	private String age2016;
	@Column(name="AÑO2017")
	private String age2017;
	@Column(name="AÑO2018")
	private String age2018;
	@Column(name="AÑO2019")
	private String age2019;
	@Column(name="AÑO2020")
	private String age2020;
	

	public Long getId() {
		return id;
	}







	public void setId(Long id) {
		this.id = id;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	public String getCode() {
		return code;
	}







	public void setCode(String code) {
		this.code = code;
	}







	public String getCountryName() {
		return countryName;
	}







	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}







	public String getCountryCode() {
		return countryCode;
	}







	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}







	public String getAge2010() {
		return age2010;
	}







	public void setAge2010(String age2010) {
		this.age2010 = age2010;
	}







	public String getAge2011() {
		return age2011;
	}







	public void setAge2011(String age2011) {
		this.age2011 = age2011;
	}







	public String getAge2012() {
		return age2012;
	}







	public void setAge2012(String age2012) {
		this.age2012 = age2012;
	}







	public String getAge2013() {
		return age2013;
	}







	public void setAge2013(String age2013) {
		this.age2013 = age2013;
	}







	public String getAge2014() {
		return age2014;
	}







	public void setAge2014(String age2014) {
		this.age2014 = age2014;
	}







	public String getAge2015() {
		return age2015;
	}







	public void setAge2015(String age2015) {
		this.age2015 = age2015;
	}







	public String getAge2016() {
		return age2016;
	}







	public void setAge2016(String age2016) {
		this.age2016 = age2016;
	}







	public String getAge2017() {
		return age2017;
	}







	public void setAge2017(String age2017) {
		this.age2017 = age2017;
	}







	public String getAge2018() {
		return age2018;
	}







	public void setAge2018(String age2018) {
		this.age2018 = age2018;
	}







	public String getAge2019() {
		return age2019;
	}







	public void setAge2019(String age2019) {
		this.age2019 = age2019;
	}







	public String getAge2020() {
		return age2020;
	}







	public void setAge2020(String age2020) {
		this.age2020 = age2020;
	}







	public static long getSerialversionuid() {
		return serialVersionUID;
	}







	private static final long serialVersionUID = 1L;

}
