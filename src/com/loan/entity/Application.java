package com.loan.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table(name = "application")
public class Application implements Serializable{
	
	private static final long serialVersionUID = 565596363023872025L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "application_id")
	private Integer key;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;

	
	/*after working code*/
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "middlename")
	private String middlename;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name="maritalstatus")
	private String maritalstatus;
	
	@Column(name="ssn", unique=true)
	private String ssn;
	
	@Column(name="loanamount")
	private Integer loanamount;
	
	@Column(name="loanpurpose")
	private String loanpurpose;
	
	@Column(name= "addressline1")
	private String addressline1;
	
	@Column(name= "addressline2")
	private String addressline2;
	
	@Column(name= "city")
	private String city;
	
	@Column(name= "state")
	private String state;
	
	@Column(name= "postalcode")
	private Integer postalcode;
	
	@Column(name= "homephone")
	private String homephone;
	
	@Column(name= "officephone")
	private String officephone;
	
	@Column(name= "mobile")
	private String mobile;
	
	@Column(name = "employername")
	private String employername;
	
	@Column(name= " annualsalary")
	private Integer annualsalary;
	
	@Column(name= " workexp")
	private Integer workexp;
	
	@Column(name = "workexpm")
	private Integer workexpm;
	
	public Integer getWorkexpm() {
		return workexpm;
	}

	public void setWorkexpm(Integer workexpm) {
		this.workexpm = workexpm;
	}

	@Column(name="designation")
	private String designation;
	
	@Column(name="empaddressline1")
	private String empaddressline1;
	
	@Column(name= "empaddressline2")
	private String empaddressline2;
	
	@Column(name= "empcity")
	private String empcity;
	
	@Column(name= "empstate")
	private String empstate;
	
	@Column(name= "emppostalcode")
	private Integer emppostalcode;
	
	@Column(name="score")
	private Integer score;
	
	@Column(name="status")
	private String status;
	
	@Column(name= "declinereason")
	private String declinereason;
	
	@Column(name= "submissiondate")
	private String submissiondate;
	
	
	public String getSubmissiondate() {
		return submissiondate;
	}

	public void setSubmissiondate(String submissiondate) {
		this.submissiondate = submissiondate;
	}

	public String getDeclinereason() {
		return declinereason;
	}

	public void setDeclinereason(String declinereason) {
		this.declinereason = declinereason;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public Integer getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(Integer loanamount) {
		this.loanamount = loanamount;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(Integer postalcode) {
		this.postalcode = postalcode;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getOfficephone() {
		return officephone;
	}

	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmployername() {
		return employername;
	}

	public void setEmployername(String employername) {
		this.employername = employername;
	}

	public Integer getAnnualsalary() {
		return annualsalary;
	}

	public void setAnnualsalary(Integer annualsalary) {
		this.annualsalary = annualsalary;
	}

	public Integer getWorkexp() {
		return workexp;
	}

	public void setWorkexp(Integer workexp) {
		this.workexp = workexp;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmpaddressline1() {
		return empaddressline1;
	}

	public void setEmpaddressline1(String empaddressline1) {
		this.empaddressline1 = empaddressline1;
	}

	public String getEmpaddressline2() {
		return empaddressline2;
	}

	public void setEmpaddressline2(String empaddressline2) {
		this.empaddressline2 = empaddressline2;
	}

	public String getEmpcity() {
		return empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	public String getEmpstate() {
		return empstate;
	}

	public void setEmpstate(String empstate) {
		this.empstate = empstate;
	}

	public Integer getEmppostalcode() {
		return emppostalcode;
	}

	public void setEmppostalcode(Integer emppostalcode) {
		this.emppostalcode = emppostalcode;
	}

	
	public Integer getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getLoanpurpose() {
		return loanpurpose;
	}

	public void setLoanpurpose(String loanpurpose) {
		this.loanpurpose = loanpurpose;
	}

	
}
