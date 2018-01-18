package com.loan.dao;

import java.util.List;

import com.loan.entity.Application;
import com.loan.entity.Applicationshort;
import com.loan.entity.bereaudata;

public interface IApplicationDAO {

boolean addApplication(Application Application);
	
	List<Application> findApplicationByString(Integer searchText);
	
	List<Applicationshort> getApplicationsDAO();
	
	bereaudata getbereaudata(Integer SSN);
}
