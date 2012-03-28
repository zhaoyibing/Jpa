package com.xiaobing.bean;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "person2")
public class Person {

	private Integer id;
	private String name;
	private int age;
	private Date birthday; // 1985-12-05
	private Gender gender = Gender.MAN;
	private float money;
	private String info;
	private Byte[] file;
	
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "personName", length = 20, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Transient
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Temporal(TemporalType.DATE)
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(nullable=false)
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	
	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	@Lob
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Lob 
	@Basic(fetch=FetchType.LAZY)
	public Byte[] getFile() {
		return file;
	}

	public void setFile(Byte[] file) {
		this.file = file;
	}
	
}
