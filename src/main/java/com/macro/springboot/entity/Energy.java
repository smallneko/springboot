package com.macro.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Table(name = "[Energy]")
public class Energy {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "BUILDING_CODE")
	private String buildingCode;
	@Column(name = "ENERGY_VALUE")
	private double energyValue;
	@Column(name = "DATETIME")
	private Date dateTime;
	@Column(name = "STANDARD_COAL_VALUE")
	private double standardCoalValue;
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

	public double getEnergyValue(){
		return energyValue;
	}
	public void setEnergyValue(double energyValue){
		this.energyValue = energyValue;
	}

	public Date getDateTime(){
		return dateTime;
	}
	public void setDateTime(Date dateTime){
		this.dateTime = dateTime;
	}

	public double getStandardCoalValue(){
		return standardCoalValue;
	}
	public void setStandardCoalValue(double standardCoalValue){
		this.standardCoalValue = standardCoalValue;
	}
}
