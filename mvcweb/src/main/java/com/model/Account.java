package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="accounts")
public class Account {
	@Id	
	
	private String acnumber ;
	private String custid  ;
	private String bid ;
	private int opening_balance;
	@Column
	@Temporal(TemporalType.DATE)
	private Date aod ;
	private String atype ;
	private String astatus ;
	
	@OneToMany
	@JoinColumn(name="acno")
	private Trandetails trandetails;
	public String getAcnumber() {
		return acnumber;
	}
	public void setAcnumber(String acnumber) {
		this.acnumber = acnumber;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public int getOpening_balance() {
		return opening_balance;
	}
	public void setOpening_balance(int opening_balance) {
		this.opening_balance = opening_balance;
	}
	public Date getAod() {
		return aod;
	}
	public void setAod(Date aod) {
		this.aod = aod;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public String getAstatus() {
		return astatus;
	}
	public void setAstatus(String astatus) {
		this.astatus = astatus;
	}
	public Account(String acnumber, String custid, String bid, int opening_balance, Date aod, String atype,
			String astatus) {
		super();
		this.acnumber = acnumber;
		this.custid = custid;
		this.bid = bid;
		this.opening_balance = opening_balance;
		this.aod = aod;
		this.atype = atype;
		this.astatus = astatus;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [acnumber=" + acnumber + ", custid=" + custid + ", bid=" + bid + ", opening_balance="
				+ opening_balance + ", aod=" + aod + ", atype=" + atype + ", astatus=" + astatus + "]";
	}
	
}
