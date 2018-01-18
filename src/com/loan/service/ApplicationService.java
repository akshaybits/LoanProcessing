package com.loan.service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.transaction.Transactional;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.joda.DateTimeFormatterFactory;
import org.springframework.stereotype.Service;

import com.loan.dao.IApplicationDAO;
import com.loan.dto.ApplicationDTO;
import com.loan.entity.Application;
import com.loan.entity.Applicationshort;
import com.loan.entity.bereaudata;
import com.loan.service.IApplicationService;


@Service("applicationService")
public class ApplicationService implements IApplicationService{

	@Autowired
	private IApplicationDAO applicationDAO;	

	@Override
	
	public void addApplication(ApplicationDTO application) {
		// TODO Auto-generated method stub
		Application appEntity = new Application();
		appEntity.setEmail(application.getEmail());
		appEntity.setName(application.getName());
		appEntity.setLastname(application.getLastname());
		
		
		appEntity.setFirstname(application.getFirstname());
		appEntity.setMiddlename(application.getMiddlename());
		appEntity.setDob(application.getDob());
		appEntity.setMaritalstatus(application.getMaritalstatus());
		appEntity.setSsn(application.getSsn());
		appEntity.setLoanamount(application.getLoanamount());
		appEntity.setLoanpurpose(application.getLoanpurpose());
		appEntity.setAddressline1(application.getLastname());
		appEntity.setAddressline2(application.getAddressline2());
		appEntity.setCity(application.getCity());
		appEntity.setState(application.getState());
		appEntity.setPostalcode(application.getPostalcode());
		appEntity.setHomephone(application.getHomephone());
		appEntity.setOfficephone(application.getOfficephone());
		appEntity.setMobile(application.getMobile());
		appEntity.setEmployername(application.getEmployername());
		appEntity.setAnnualsalary(application.getAnnualsalary());
		appEntity.setWorkexp(application.getWorkexp());
		appEntity.setDesignation(application.getDesignation());
		appEntity.setEmpaddressline1(application.getEmpaddressline1());
		appEntity.setEmpaddressline2(application.getEmpaddressline2());
		appEntity.setEmpcity(application.getEmpcity());
		appEntity.setEmpstate(application.getEmpstate());
		appEntity.setWorkexpm(application.getWorkexpm());
		appEntity.setEmppostalcode(application.getEmppostalcode());
		System.out.println("here1");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String submissiondate=dateFormat.format(date);	
		org.joda.time.format.DateTimeFormatter formatter = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
		DateTime dt = formatter.parseDateTime(application.getDob());
		DateTime dt2 = new DateTime();
		int years = Years.yearsBetween(dt, dt2).getYears();
		
		application.setSubmissiondate(submissiondate);
		appEntity.setSubmissiondate(application.getSubmissiondate());
		System.out.println("here2");
		/*Integer score=getScore( firstname, email, lastname, middlename, marital, SSN, loanamount, loanpurpose, descript, addressline1, pincode, homephone, officephone,
				 mobile, workyears, workmonths, salary, empladdressline1, emplname, emplpincode , design) ;
		*/
		Integer score=getScore( appEntity.getSsn(), appEntity.getLoanamount(), appEntity.getWorkexp(), appEntity.getAnnualsalary() ) ;
		System.out.println(score);
		//application.setScore(score);
	//	appEntity.setScore(score);
//	Integer score=getScore(application.getAnnualsalary());
//		application.setScore(score); 
		
		if(application.getAnnualsalary() <= 10000){
			System.out.println("inside salary condition");
			application.setStatus("Declined");
			//appEntity.setStatus(application.getStatus());
			appEntity.setDeclinereason("Declined Salary");
			application.setScore(0);
			
			

		}
		else if(application.getWorkexpm() < 6 && application.getWorkexp() < 1){
			appEntity.setDeclinereason("Declined Work Exp");
			application.setStatus("Declined");
			application.setScore(0);

			//appEntity.setStatus("Declined");

		}
		else if(years <= 18){
			appEntity.setDeclinereason("Too young");
			application.setStatus("Declined");
			application.setScore(0);

		//	appEntity.setStatus("Declined");

		}
		else if(years > 65){
			appEntity.setDeclinereason("Too Old");
			application.setStatus("Declined");
			application.setScore(0);

		//	appEntity.setStatus("Declined");

		}
		
//		else if(score < 300){
//			score = 300;
//		}
//		else if(score > 800){
//			score = 800;
//		}
		else if(score >= 400){
			application.setStatus("Approved");

			//appEntity.setStatus("Approved");
			application.setScore(score);
		}
		else {
			System.out.println("score");
			application.setStatus("Declined");
			appEntity.setDeclinereason("Bad Credit History");
			application.setScore(score);
		} 
		try {
			appEntity.setScore(application.getScore());
			appEntity.setStatus(application.getStatus());
			applicationDAO.addApplication(appEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
//	public Integer getAge(String dob){
//	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	Date date = new Date();
//	String submissiondate=dateFormat.format(date);	
//	org.joda.time.format.DateTimeFormatter formatter = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
//	DateTime dt = formatter.parseDateTime(dob);
//	DateTime dt2 = new DateTime();
//	int years = Years.yearsBetween(dt, dt2).getYears();
//	return years;
//	}
	
	@Override
	public List<Applicationshort> getApplicationList(String searchText) {
		List<Applicationshort> applicationList = applicationDAO.getApplicationsDAO();
		return applicationList;
	}
	
	@Override
	public List<Application> getapplication(Integer searchText) {
		List<Application> application1List = applicationDAO.findApplicationByString(searchText);
		return application1List;
		
	}
		
	@Override
	/*public Integer getScore(String firstname,String email,String lastname,String middlename,String marital,Integer SSN,Integer loanamount,String loanpurpose,String descript,String addressline1,Integer pincode,String homephone,String officephone,
			String mobile,Integer workyears,Integer workmonths,Integer salary,String empladdressline1,String emplname,Integer emplpincode ,String design){
		*/
	
	


		
		
		
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = new Date();
//		String submissiondate=dateFormat.format(date);	
//		DateTimeFormatter formatter = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");//forPattern ("yyyy-MM-dd");
//		DateTime dt = formatter.parseDateTime(application.getDob());
//		DateTime dt2 = new DateTime();
//		int years = Years.yearsBetween(dt, dt2).getYears();
//	//	org.joda.time.format.DateTimeFormat.forPattern(String);
//		application.setSubmissiondate(submissiondate);
//		appEntity.setSubmissiondate(application.getSubmissiondate());
//		
//	//	String submissiondate = null;
//		application.setSubmissiondate(submissiondate);
//		appEntity.setSubmissiondate(application.getSubmissiondate());
//		
//		Integer score=getScore( appEntity.getSsn(), appEntity.getLoanamount(), appEntity.getWorkexp(), appEntity.getAnnualsalary() ) ;
//		application.setScore(score);
//		appEntity.setScore(score);
//		
//		
////		if(application.getAnnualsalary() <= 10000){
////			appEntity.setDeclinereason("Declined Salary");
////		}
////		else if(application.getWorkexp() <= 6){
////			appEntity.setDeclinereason("Declined Work Exp");
////		}
////		else if(years <= 18){
////			appEntity.setDeclinereason("Get out Kid");
////		}
////		else {
////			appEntity.setDeclinereason("Not Declined");
////		}
////		
////		if(application.getScore() >= 400){
////			application.setStatus("Approved");
////		}
////		else {
////			application.setStatus("Declined");
////		} 
////		try {
////			appEntity.setScore(application.getScore());
////			appEntity.setStatus(application.getStatus());
////			applicationDAO.addApplication(appEntity);
////		} catch (Exception e) {
////			e.printStackTrace();
////		}
////		
////		
////		
////	}
//	
////	public Integer getAge(String dob){
////	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
////	Date date = new Date();
////	String submissiondate=dateFormat.format(date);	
////	org.joda.time.format.DateTimeFormatter formatter = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
////	DateTime dt = formatter.parseDateTime(dob);
////	DateTime dt2 = new DateTime();
////	int years = Years.yearsBetween(dt, dt2).getYears();
////	return years;
////	}
//	
//	@Override
//	public List<Applicationshort> getApplicationList(String searchText) {
//		List<Applicationshort> applicationList = applicationDAO.getApplicationsDAO();
//		return applicationList;
//	}
//	
//	@Override
//	public List<Application> getapplication(Integer searchText) {
//		List<Application> application1List = applicationDAO.findApplicationByString(searchText);
//		return application1List;
//		
//	}
//		
//		Integer i=0;
//if(years < 18 ){
//			appEntity.setDeclinereason("Under Age");
//			application.setStatus("Declined");
//			i=1;
//		}
//else if( years >65){
//			appEntity.setDeclinereason("Above Age limit");
//			application.setStatus("Declined");
//			i=1;
//		}
////		if(false){
////			appEntity.setDeclinereason("Age is too low");
////			application.setStatus("Declined");
////		}
////		else if(false){
////			
////			appEntity.setDeclinereason("Age is too high");
////			application.setStatus("Declined");
////		}
//	 
//			
//else if(application.getAnnualsalary() <= 10000){
//			appEntity.setDeclinereason("Low Income");
//			application.setStatus("Declined");
//			//i=1;
//		}
//		
//		else if(application.getWorkexpm() < 6 && application.getWorkexp() == 0 ){			
//			appEntity.setDeclinereason("Not enough Work Experience");
//			application.setStatus("Declined");
//			//i=1;
//		}
//		else if(application.getScore() >= 630){
//			application.setStatus("Approved");
//			appEntity.setDeclinereason("NA");
//		}
//		else{
//			application.setStatus("Declined");
//			appEntity.setDeclinereason("Bad Credit History");
//		}
//		if(i<1){
//			appEntity.setDeclinereason("NA");
//		}
//		
//		if(application.getScore() >= 630 && i!=1){
//			application.setStatus("Approved");
//		}
//		else if(i<1){
//			application.setStatus("Declined");
//		} 
//		else{
//			application.setStatus("Declined");
//			appEntity.setDeclinereason("Bad Credit History");
//		}
//		try {
//			appEntity.setScore(application.getScore());
//			appEntity.setStatus(application.getStatus());
//			applicationDAO.addApplication(appEntity);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		
//	}
//	
//	
//	
//	@Override
//	public List<Applicationshort> getApplicationList(String searchText) {
//		List<Applicationshort> applicationList = applicationDAO.getApplicationsDAO();
//		return applicationList;
//	}
//	
//	@Override
//	public List<Application> getapplication(Integer searchText) {
//		List<Application> application1List = applicationDAO.findApplicationByString(searchText);
//		return application1List;
//		
//	}
//		
//@Override
	public Integer getScore(String SSN, Integer loanamount,Integer workyears,Integer salary){
		
		bereaudata data=applicationDAO.getbereaudata(Integer.parseInt(SSN));
		Integer score;
			if(data!=null){
				System.out.println("here3");
		Float coef_intrcpt=300f;
		Float coef_la=-0.00027f;
		Float coef_wy=1.59f;
		Float coef_sal=0.00028f;
		Float coef_il6m=-15.83f;
		Float coef_msld=0.88f;
		Float coef_pr=-32.8f;
		Float coef_rb=0.000341f;
		Float coef_ru=-76.5f;
		Float coef_ta=6.94f; 
//		
				
		//System.out.println(data.getRevol_bal());		
//		Float coef_intrcpt=460f;
//		Float coef_la=-000003.49f;
//		Float coef_wy=1.59f;
//		Float coef_sal=0.00028f;
//		Float coef_il6m=-0.0132f;
//		Float coef_msld=0.00048f;
//		Float coef_pr=-0.12267f;
//		Float coef_rb=0.000341f;
//		Float coef_ru=-0.05f;
//		Float coef_ta=0.0019f;
		
		Float total=coef_intrcpt  + coef_la*loanamount + coef_wy*workyears + coef_sal*salary +
				coef_il6m*data.getInq_last_6mths() + coef_msld *data.getMths_since_last_delinq() +
				coef_pr*data.getPub_rec() + coef_rb*data.getRevol_bal() + coef_ru*data.getRevol_util()
				+ coef_ta*data.getTotal_acc();
		
		score = Math.round(total);
			}
			else{
				score=630;
			}
			if(score < 300){
				return 300;
			}
			else if( score >800 ){
				return 800;
			}
		return score;
			
	}
	}

