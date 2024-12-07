package com.AKC.Hibernate_CRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	int sid;
	String sname;
	String emailid;
	double fee;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", emailid=" + emailid + ", fee=" + fee + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}