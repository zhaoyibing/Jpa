package com.xiaobing.compositePK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

/**
 * 复合主键条件：
 *   1, public 无参构造函数
 *   2, implements Serializable
 *   3, override hashCode & equals
 * @author xiaobing
 *
 */
@Embeddable
public class AirLinePK implements Serializable{

	@Transient
	private static final long serialVersionUID = -8646129417350468626L;
	private String startCity;
	private String endCity;
	
	public AirLinePK() {
	}

	public AirLinePK(String startCity, String endCity) {
		super();
		this.startCity = startCity;
		this.endCity = endCity;
	}

	@Column(length=3)
	public String getStartCity() {
		return startCity;
	}

	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}

	@Column(length=3)
	public String getEndCity() {
		return endCity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endCity == null) ? 0 : endCity.hashCode());
		result = prime * result
				+ ((startCity == null) ? 0 : startCity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirLinePK other = (AirLinePK) obj;
		if (endCity == null) {
			if (other.endCity != null)
				return false;
		} else if (!endCity.equals(other.endCity))
			return false;
		if (startCity == null) {
			if (other.startCity != null)
				return false;
		} else if (!startCity.equals(other.startCity))
			return false;
		return true;
	}

	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}

}
