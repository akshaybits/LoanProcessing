package com.loan.dto;

public class ApplicationDTO {

	private String name;
	private String email;
	private String lastname;	
	private String firstname;
	private String middlename;
	private String dob;
	private String maritalstatus;
	private String ssn;
	private Integer loanamount;
	private String loanpurpose;
	private String addressline1;
	private String addressline2;
	private String city;
	private String state;
	private Integer postalcode;
	private String homephone;
	private String officephone;
	private String mobile;
	private String employername;
	private Integer annualsalary;
	private Integer workexp;
	private String designation;
	private String empaddressline1;
	private String empaddressline2;
	private String empcity;
	private String empstate;
	private Integer emppostalcode;
	
	private Integer score;
	private String status;
	private String declinereason;
	private String submissiondate;
	
	private Integer workexpm;
	
	public Integer getWorkexpm() {
		return workexpm;
	}
	public void setWorkexpm(Integer workexpm) {
		this.workexpm = workexpm;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	
	public ApplicationDTO(String name, String email, String lastname, 
			 String firstname,
			 String middlename,
			 String dob,
			 String maritalstatus,
			 String ssn,
			 Integer loanamount,
			 String loanpurpose,
			 String addressline1,
			 String addressline2,
			 String city,
			 String state,
			 Integer postalcode,
			 String homephone,
			 String officephone,
			 String mobile,
			 String employername,
			 Integer annualsalary,
			 Integer workexp,
			 String designation,
			 String empaddressline1,
			 String empaddressline2,
			 String empcity,
			 String empstate,
			 Integer emppostalcode,
			 Integer score,
			 String status,
			 String declinereason,
			 String submissiondate,
			 Integer workexpm) {
		super();
		this.name = name;
		this.email = email;
		this.lastname = lastname;
		
		
		this.firstname = firstname;
		this.middlename = middlename;
		this.dob=dob;
		this.maritalstatus=maritalstatus;
		this.ssn=ssn;
		this.loanamount = loanamount;
		this.loanpurpose = loanpurpose;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
		this.homephone = homephone;
		this.officephone = officephone;
		this.mobile = mobile;
		this.employername = employername;
		this.annualsalary = annualsalary;
		this.workexp = workexp;
		this.designation = designation;
		this.empaddressline1 = empaddressline1;
		this.empaddressline2 = empaddressline2;
		this.empcity = empcity;
		this.empstate = empstate;
		this.emppostalcode = emppostalcode;	
		
		this.score=score;
		this.status=status;
		this.declinereason=declinereason;
		this.submissiondate=submissiondate;
		this.workexpm=workexpm;
		//this.key = key;
	}
	
	
}
