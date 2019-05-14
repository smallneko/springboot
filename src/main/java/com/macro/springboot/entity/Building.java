package com.macro.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

public class Building {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "BUILDING_CODE")
	private String buildingCode;
	@Column(name = "BUILDING_NAME")
	private String buildingName;
	@Column(name = "AB_NAME")
	private String abName;
	@Column(name = "LON")
	private String lon;
	@Column(name = "LAT")
	private String lat;
	@Column(name = "CITY_CODE")
	private String cityCode;
	@Column(name = "BUILDING_ADDRESS")
	private String buildingAddress;
	@Column(name = "FINISH_TIME")
	private Date finishTime;
	@Transient
	private String other; //跟数据库无关的字段使用@Transient标记或移至VO类。

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getBuildingCode(){
		return buildingCode;
	}
	public void setBuildingCode(String buildingCode){
		this.buildingCode = buildingCode;
	}

	public String getBuildingName(){
		return buildingName;
	}
	public void setBuildingName(String buildingName){
		this.buildingName = buildingName;
	}

	public String getAbName(){
		return abName;
	}
	public void setAbName(String abName){
		this.abName = abName;
	}

	public String getLon(){
		return lon;
	}
	public void setLon(String lon){
		this.lon = lon;
	}

	public String getLat(){
		return lat;
	}
	public void setLat(String lat){
		this.lat = lat;
	}

	public String getCityCode(){
		return cityCode;
	}
	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}

	public String getBuildingAddress(){
		return buildingAddress;
	}
	public void setBuildingAddress(String buildingAddress){
		this.buildingAddress = buildingAddress;
	}

	public Date getFinishTime(){
		return finishTime;
	}
	public void setFinishTime(Date finishTime){
		this.finishTime = finishTime;
	}

}
