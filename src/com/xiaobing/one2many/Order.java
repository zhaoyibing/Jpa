package com.xiaobing.one2many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	private String orderId;
	private Float amount = 0f;
	private Set<OrderItem> orderItems = new HashSet<OrderItem>();

	@Id
	@Column(length=12)
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Column(nullable=false)
	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	//@OneToMany(cascade={CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
	@OneToMany(cascade={CascadeType.ALL},
			fetch=FetchType.LAZY,
			mappedBy="order")
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	public void addOrderItem(OrderItem orderItem){
		orderItem.setOrder(this);
		this.orderItems.add(orderItem);
	}

}
