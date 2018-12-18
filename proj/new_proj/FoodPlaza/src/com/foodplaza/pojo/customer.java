package com.foodplaza.pojo;

public class customer 
{
private int id;
private String name;
private long contactno;
private String address;
private String email;
private String password;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getContactno() {
	return contactno;
}
public void setContactno(long contactno) {
	this.contactno = contactno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
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
@Override
public String toString() {
	return "customer [id=" + id + ", name=" + name + ", contactno=" + contactno + ", address=" + address + ", email="
			+ email + ", password=" + password + "]";
}

}
