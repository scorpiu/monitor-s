package com.ideal.property.dto;

/**
 * @Auther: alan
 * @Date: 2019年1月25日
 * @Description:
 */
public class UserInfoDto {
	private Integer id;
	private String user_name;
	private String wechat_id;
	private String cell_phone;
	private String email;
	private String password;
	private String contact_address;
	private String register_date;
	private String open_id;
	private Integer status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getWechat_id() {
		return wechat_id;
	}
	public void setWechat_id(String wechat_id) {
		this.wechat_id = wechat_id;
	}
	public String getCell_phone() {
		return cell_phone;
	}
	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact_address() {
		return contact_address;
	}
	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}
	public String getRegister_date() {
		return register_date;
	}
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}
	public String getOpen_id() {
		return open_id;
	}
	public void setOpen_id(String open_id) {
		this.open_id = open_id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "UserInfoDto [id=" + id + ", user_name=" + user_name + ", wechat_id=" + wechat_id + ", cell_phone="
				+ cell_phone + ", email=" + email + ", password=" + password + ", contact_address=" + contact_address
				+ ", register_date=" + register_date + ", open_id=" + open_id + ", status=" + status + "]";
	}
	
	
}
