package com.xiaobing.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Husband {

	private Integer id;
	private String info;
	private Wife wife;

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	@Column(length=18,nullable=false)
	public void setInfo(String info) {
		this.info = info;
	}

	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.MERGE},
			mappedBy="husband")
	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}
	
	

}
