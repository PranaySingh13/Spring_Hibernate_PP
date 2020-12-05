package com.pp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class WebServiceModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int uid;
	
	@Column
	private String uemail;
	
	@Column
	private String upassword;
	
	@Column
	private String ufirstName;
	
	@Column
	private String ulastName;
	
	@Column
	private long ucontact;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUfirstName() {
		return ufirstName;
	}

	public void setUfirstName(String ufirstName) {
		this.ufirstName = ufirstName;
	}

	public String getUlastName() {
		return ulastName;
	}

	public void setUlastName(String ulastName) {
		this.ulastName = ulastName;
	}

	public long getUcontact() {
		return ucontact;
	}

	public void setUcontact(long ucontact) {
		this.ucontact = ucontact;
	}
	
}
