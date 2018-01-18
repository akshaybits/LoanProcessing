package com.loan.service;

import java.util.List;

import com.loan.dto.ApplicationDTO;
import com.loan.entity.Application;
import com.loan.entity.Applicationshort;

public interface IApplicationService {

void addApplication(ApplicationDTO employee);
	
	List<Applicationshort> getApplicationList(String searchText);

	List<Application> getapplication(Integer searchText);
	
	/*public Integer getScore(String firstname,String email,String lastname,String middlename,String marital,Integer SSN,Integer loanamount,String loanpurpose,String descript,String addressline1,Integer pincode,String homephone,String officephone,
			String mobile,Integer workyears,Integer workmonths,Integer salary,String empladdressline1,String emplname,Integer emplpincode ,String design);
	*/
	public Integer getScore(String SSN, Integer loanamount,Integer workyears,Integer salary);
}
