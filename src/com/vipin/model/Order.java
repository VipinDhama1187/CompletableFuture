package com.vipin.model;

/**
 * The Class Order.
 */
public class Order {
	
	private final long id;

	public Order(long id) {this.id = id;}

	public long getId() {
		return id;
	}

	/** The order id. */
	private String orderId;

	/** The enrich order. */
	private Boolean enrichOrder;

	/** The order payment. */
	private Boolean orderPayment;

	/** The dispatch order. */
	private Boolean dispatchOrder;

	/** The send email. */
	private Boolean sendEmail;

	/**
	 * Gets the order id.
	 *
	 * @return the order id
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * Sets the order id.
	 *
	 * @param orderId the new order id
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * Gets the enrich order.
	 *
	 * @return the enrich order
	 */
	public Boolean getEnrichOrder() {
		return enrichOrder;
	}

	/**
	 * Sets the enrich order.
	 *
	 * @param enrichOrder the new enrich order
	 */
	public void setEnrichOrder(Boolean enrichOrder) {
		this.enrichOrder = enrichOrder;
	}

	/**
	 * Gets the order payment.
	 *
	 * @return the order payment
	 */
	public Boolean getOrderPayment() {
		return orderPayment;
	}

	/**
	 * Sets the order payment.
	 *
	 * @param orderPayment the new order payment
	 */
	public void setOrderPayment(Boolean orderPayment) {
		this.orderPayment = orderPayment;
	}

	/**
	 * Gets the dispatch order.
	 *
	 * @return the dispatch order
	 */
	public Boolean getDispatchOrder() {
		return dispatchOrder;
	}

	/**
	 * Sets the dispatch order.
	 *
	 * @param dispatchOrder the new dispatch order
	 */
	public void setDispatchOrder(Boolean dispatchOrder) {
		this.dispatchOrder = dispatchOrder;
	}

	/**
	 * Gets the send email.
	 *
	 * @return the send email
	 */
	public Boolean getSendEmail() {
		return sendEmail;
	}

	/**
	 * Sets the send email.
	 *
	 * @param sendEmail the new send email
	 */
	public void setSendEmail(Boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", enrichOrder=" + enrichOrder + ", orderPayment="
				+ orderPayment + ", dispatchOrder=" + dispatchOrder + ", sendEmail=" + sendEmail + "]";
	}

}
