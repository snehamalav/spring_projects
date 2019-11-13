package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
private int eid;
private String emailid;
private String name;
private String password;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Users() {
	super();
}
@Override
public String toString() {
	return "Users [eid=" + eid + ", emailid=" + emailid + ", name=" + name + ", password=" + password + "]";
}



}
