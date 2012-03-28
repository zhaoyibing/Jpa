package com.xiaobing.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Wife {

	private Integer id;
	private String name;
	private Husband husband;

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=20,nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToOne(cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="husband_id")
	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}
	

}
