package com.loan.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bureaudata")
public class bereaudata {

	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "delinq_2yrs")
	private Integer delinq_2yrs;
	
	@Column(name = "inq_last_6mths")
	private Integer inq_last_6mths;
	
	@Column(name = "mths_since_last_delinq")
	private Integer mths_since_last_delinq;
	
	@Column(name = "mths_since_last_record")
	private Integer mths_since_last_record;
	
	@Column(name = "open_acc")
	private Integer open_acc;

	@Column(name = "revol_bal")
	private Integer revol_bal;
	
	@Column(name = "revol_util")
	private Integer revol_util;
	
	@Column(name = "total_acc")
	private Integer total_acc;
	
	@Column(name = "earliest_cr_line")
	private Date earliest_cr_line;
	
	@Column(name = "pub_rec")
	private Integer pub_rec;
	
	
	public Integer getPub_rec() {
		return pub_rec;
	}
	public void setPub_rec(Integer pub_rec) {
		this.pub_rec = pub_rec;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDelinq_2yrs() {
		return delinq_2yrs;
	}
	public void setDelinq_2yrs(Integer delinq_2yrs) {
		this.delinq_2yrs = delinq_2yrs;
	}
	public Integer getInq_last_6mths() {
		return inq_last_6mths;
	}
	public void setInq_last_6mths(Integer inq_last_6mths) {
		this.inq_last_6mths = inq_last_6mths;
	}
	public Integer getMths_since_last_delinq() {
		return mths_since_last_delinq;
	}
	public void setMths_since_last_delinq(Integer mths_since_last_delinq) {
		this.mths_since_last_delinq = mths_since_last_delinq;
	}
	public Integer getMths_since_last_record() {
		return mths_since_last_record;
	}
	public void setMths_since_last_record(Integer mths_since_last_record) {
		this.mths_since_last_record = mths_since_last_record;
	}
	public Integer getOpen_acc() {
		return open_acc;
	}
	public void setOpen_acc(Integer open_acc) {
		this.open_acc = open_acc;
	}
	public Integer getRevol_bal() {
		return revol_bal;
	}
	public void setRevol_bal(Integer revol_bal) {
		this.revol_bal = revol_bal;
	}
	public Integer getRevol_util() {
		return revol_util;
	}
	public void setRevol_util(Integer revol_util) {
		this.revol_util = revol_util;
	}
	public Integer getTotal_acc() {
		return total_acc;
	}
	public void setTotal_acc(Integer total_acc) {
		this.total_acc = total_acc;
	}
	public Date getEarliest_cr_line() {
		return earliest_cr_line;
	}
	public void setEarliest_cr_line(Date earliest_cr_line) {
		this.earliest_cr_line = earliest_cr_line;
	}
	
}
