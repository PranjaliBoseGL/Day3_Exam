package com.customer.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity

public class Customer {

@Id

private int cid;

private String cname;

private String cphone;

private String caddress;

private String cloginid;

private String cpassword;

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getCphone() {
	return cphone;
}

public void setCphone(String cphone) {
	this.cphone = cphone;
}

public String getCaddress() {
	return caddress;
}

public void setCaddress(String caddress) {
	this.caddress = caddress;
}

public String getCloginid() {
	return cloginid;
}

public void setCloginid(String cloginid) {
	this.cloginid = cloginid;
}

public String getCpassword() {
	return cpassword;
}

public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}

@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", cphone=" + cphone + ", caddress=" + caddress + ", cloginid="
			+ cloginid + ", cpassword=" + cpassword + "]";
}

}

