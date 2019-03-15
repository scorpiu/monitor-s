package com.ideal.property.dto;

public class CustomerServiceDto {
	
	private int prod_inst_id;
	private String contact_name;
	private String reservation_date;
	private String reservation_time;
	public int getProd_inst_id() {
		return prod_inst_id;
	}
	public void setProd_inst_id(int prod_inst_id) {
		this.prod_inst_id = prod_inst_id;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(String reservation_date) {
		this.reservation_date = reservation_date;
	}
	public String getReservation_time() {
		return reservation_time;
	}
	public void setReservation_time(String reservation_time) {
		this.reservation_time = reservation_time;
	}
	@Override
	public String toString() {
		return "CustomerServiceDto [prod_inst_id=" + prod_inst_id + ", contact_name=" + contact_name
				+ ", reservation_date=" + reservation_date + ", reservation_time=" + reservation_time + "]";
	}
	
}
