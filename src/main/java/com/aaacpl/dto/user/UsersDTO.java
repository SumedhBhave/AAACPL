package com.aaacpl.dto.user;

import java.sql.Date;

public class UsersDTO {
	private int id;
	private int typeId;
	private int departmentId;
	private String name;
	private String companyName;
	private String email;
	private String password;
	private String material;
	private String address;
	private String city;
	private String country;
	private String state;
	private int pin;
	private String panNumber;
	private String vatNumber;
	private String mobile;
	private String phone;
	private Date registrationDate;
	private char status;
	private String isVerified;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String isVerified() {
		return isVerified;
	}

	public void setVerified(String verified) {
		isVerified = verified;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UsersDTO usersDTO = (UsersDTO) o;

		if (id != usersDTO.id) return false;
		if (typeId != usersDTO.typeId) return false;
		if (departmentId != usersDTO.departmentId) return false;
		if (pin != usersDTO.pin) return false;
		if (status != usersDTO.status) return false;
		if (isVerified != usersDTO.isVerified) return false;
		if (name != null ? !name.equals(usersDTO.name) : usersDTO.name != null) return false;
		if (companyName != null ? !companyName.equals(usersDTO.companyName) : usersDTO.companyName != null)
			return false;
		if (email != null ? !email.equals(usersDTO.email) : usersDTO.email != null) return false;
		if (password != null ? !password.equals(usersDTO.password) : usersDTO.password != null) return false;
		if (material != null ? !material.equals(usersDTO.material) : usersDTO.material != null) return false;
		if (address != null ? !address.equals(usersDTO.address) : usersDTO.address != null) return false;
		if (city != null ? !city.equals(usersDTO.city) : usersDTO.city != null) return false;
		if (country != null ? !country.equals(usersDTO.country) : usersDTO.country != null) return false;
		if (state != null ? !state.equals(usersDTO.state) : usersDTO.state != null) return false;
		if (panNumber != null ? !panNumber.equals(usersDTO.panNumber) : usersDTO.panNumber != null) return false;
		if (vatNumber != null ? !vatNumber.equals(usersDTO.vatNumber) : usersDTO.vatNumber != null) return false;
		if (mobile != null ? !mobile.equals(usersDTO.mobile) : usersDTO.mobile != null) return false;
		if (phone != null ? !phone.equals(usersDTO.phone) : usersDTO.phone != null) return false;
		return registrationDate != null ? registrationDate.equals(usersDTO.registrationDate) : usersDTO.registrationDate == null;

	}


	@Override
	public String toString() {
		return "UsersDTO{" +
				"id=" + id +
				", typeId=" + typeId +
				", departmentId=" + departmentId +
				", name='" + name + '\'' +
				", companyName='" + companyName + '\'' +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", material='" + material + '\'' +
				", address='" + address + '\'' +
				", city='" + city + '\'' +
				", country='" + country + '\'' +
				", state='" + state + '\'' +
				", pin=" + pin +
				", panNumber='" + panNumber + '\'' +
				", vatNumber='" + vatNumber + '\'' +
				", mobile='" + mobile + '\'' +
				", phone='" + phone + '\'' +
				", registrationDate=" + registrationDate +
				", status=" + status +
				", isVerified=" + isVerified +
				'}';
	}

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + typeId;
        result = 31 * result + departmentId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (material != null ? material.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + pin;
        result = 31 * result + (panNumber != null ? panNumber.hashCode() : 0);
        result = 31 * result + (vatNumber != null ? vatNumber.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (registrationDate != null ? registrationDate.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (isVerified != null ? isVerified.hashCode() : 0);
        return result;
    }
}
