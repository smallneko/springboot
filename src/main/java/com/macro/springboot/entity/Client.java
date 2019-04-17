package com.macro.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "[Client]")
public class Client {
	@Id
	@Column(name = "CLIENT_ID")
	private String clientId;
	@Column(name = "CLIENT_NAME")
	private String clientName;
	@Column(name = "TEL")
	private String tel;
	@Transient
	private String other; //跟数据库无关的字段使用@Transient标记或移至VO类。

	public String getClientId(){
		return clientId;
	}

	public void setClientId(String clientId){
		this.clientId = clientId;
	}

	public String getClientName(){
		return clientName;
	}

	public void setClientName(String clientName){
		this.clientName = clientName;
	}

	public String getTel(){
		return tel;
	}

	public void setTel(String tel){
		this.tel = tel;
	}

}
