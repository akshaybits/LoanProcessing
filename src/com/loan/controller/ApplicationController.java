package com.loan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.loan.dto.ApplicationDTO;
import com.loan.service.IApplicationService;



@Controller
@RequestMapping
public class ApplicationController {

	@Autowired
	private IApplicationService applicationService;
	
	/**
	 * Controller method to add new 
	 * @param name
	 * @param email
	 * @return
	 */
	@RequestMapping(value = "/add.do", method = RequestMethod.POST)
	public String addContact(@RequestParam(value = "name") String name,
			@RequestParam(value = "email")String email,
			@RequestParam(value = "lastname")String lastname,			
			@RequestParam(value = "firstname")String firstname,
			@RequestParam(value = "middlename")String middlename,
			@RequestParam(value = "dob")String dob,
			@RequestParam(value = "maritalstatus")String maritalstatus,
			@RequestParam(value = "ssn")String ssn,
			@RequestParam(value = "loanamount")Integer loanamount,
			@RequestParam(value = "loanpurpose")String loanpurpose,
			@RequestParam(value = "addressline1")String addressline1,
			@RequestParam(value = "addressline2")String addressline2,
			@RequestParam(value = "city")String city,
			@RequestParam(value = "state")String state,
			@RequestParam(value = "postalcode")Integer postalcode,
			@RequestParam(value = "homephone")String homephone,
			@RequestParam(value = "officephone")String officephone,
			@RequestParam(value = "mobile")String mobile,
			@RequestParam(value = "employername")String employername,
			@RequestParam(value = "annualsalary")Integer annualsalary,
			@RequestParam(value = "workexp")Integer workexp,
			@RequestParam(value = "designation")String designation,
			@RequestParam(value = "empaddressline1")String empaddressline1 ,
			@RequestParam(value = "empaddressline2")String empaddressline2,
			@RequestParam(value = "empcity")String empcity,
			@RequestParam(value = "empstate")String empstate,
			@RequestParam(value = "emppostalcode")Integer emppostalcode,
			@RequestParam(value = "workexpm")Integer workexpm){
		applicationService.addApplication(new ApplicationDTO(name, email, lastname, firstname,
				 middlename,
				 dob,
				 maritalstatus,
				 ssn,
				 loanamount,
				 loanpurpose,
				 addressline1,
				addressline2,
				 city,
				 state,
				postalcode,
				homephone,
				 officephone,
				 mobile,
				 employername,
				annualsalary,
				workexp,
				designation,
				empaddressline1,
				empaddressline2,
				empcity,
				empstate,
				emppostalcode,
				400,
				"In Progess",
				"NA",
				"submissiondate",workexpm));
		String redirectView = "redirect:/success.jsp";
		return redirectView;
	}
	
	@RequestMapping(value = "/show.do", method = RequestMethod.GET)
	public String showPage() {
		System.out.println("here");
		String redirectView = "redirect:/addemployee.jsp";
		return redirectView;
	}
	
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public ModelAndView listApplications() {
		ModelAndView model = new ModelAndView("listemployee.jsp");
		model.addObject("list", applicationService.getApplicationList(null)); 
		return model;
	}
	
	@RequestMapping(value = "/viewSearch.do", method = RequestMethod.GET)
	public ModelAndView listApplicationWithSearchParams(@RequestParam(value = "searchText") Integer searchText) {
		ModelAndView model = new ModelAndView("viewapplication.jsp");
		model.addObject("list", applicationService.getapplication(searchText)); 
		return model;
	}
	
	private List getApplicationList(){
		List list = new ArrayList<ApplicationDTO>();
		list.add(new ApplicationDTO("test", "test@mail.com", "laasttest",   "firstname",
				"middlename",
				"dob",
				"married",
				"123ssn",
				100000,
				"debt",
				 "addressline1",
				"addressline2",
				 "city",
				 "state",
				533305,
				"885",
				"885",
				"9949",
				 "employername",
				222,
				1,
				"engineer",
				"empaddressline1",
				"empaddressline2",
				"empcity",
				"empstate",
				560017,
				400,
				"In Progress","NA","submissiondate",4));
		return list;
		
	}
}
