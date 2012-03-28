package com.xiaobing.one2many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

	private Integer id;
	private String productName;
	private Float price;
	private Order order;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=40,nullable=false)
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(nullable=false)
	public Float getPrice() {
		return price;
	}

	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH },
			fetch=FetchType.EAGER,
			optional=false)
	@JoinColumn(name="order_id")
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
