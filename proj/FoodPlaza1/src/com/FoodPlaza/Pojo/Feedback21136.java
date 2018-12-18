package com.FoodPlaza.Pojo;

public class Feedback21136 
{
private String firstname;
private String lastname;
private String email;
private long contactno;
private String comments;

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getContactno() {
	return contactno;
}
public void setContactno(long contactno) {
	this.contactno = contactno;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}

@Override
public String toString() {
	return "Feedback21136 [firstname=" + firstname + ", lastname=" + lastname
			+ ", email=" + email + ", contactno=" + contactno + ", comments="
			+ comments + "]";
}

}
