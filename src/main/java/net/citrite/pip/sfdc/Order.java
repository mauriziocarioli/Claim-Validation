package net.citrite.pip.sfdc;

import java.io.Serializable;
import java.util.List;

@org.kie.api.definition.type.Label("Order")
public class Order implements Serializable {

	private static final long serialVersionUID = 6810510455129323181L;
	
	@org.kie.api.definition.type.Label("Order Header")
	private OrderHeader OrderHeader;
	@org.kie.api.definition.type.Label("Order Line Items")
	private List<OrderLineItem> OrderLineItems;

	public OrderHeader getOrderHeader() {
		return this.OrderHeader;
	}

	public void setOrderHeader(OrderHeader OrderHeader) {
		this.OrderHeader = OrderHeader;
	}

	public List<OrderLineItem> getOrderLineItems() {
		return this.OrderLineItems;
	}

	public void setOrderLineItems(List<OrderLineItem> OrderLineItems) {
		this.OrderLineItems = OrderLineItems;
	}

	public Order(OrderHeader OrderHeader, List<OrderLineItem> OrderLineItems) {
		this.OrderHeader = OrderHeader;
		this.OrderLineItems = OrderLineItems;
	}

	public Order() {
	}

}
