package com.maveric.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maveric.model.MavCustomerMaster;
import com.maveric.service.MavCustomerMasterService;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private MavCustomerMasterService customerService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public UserRegistrationController(MavCustomerMasterService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@ModelAttribute("user")
    public MavCustomerMaster userRegistrationDto() {
        return new MavCustomerMaster();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") MavCustomerMaster mavCustomerMaster) {
		try
		{
			MavCustomerMaster usercheck1 = null;
			MavCustomerMaster usercheck2 = null;
			try
			{
				usercheck1 = customerService.findByUsername(mavCustomerMaster.getUserName());
			}
			catch(UsernameNotFoundException e)
			{
				System.out.println("New User!!");
			}
			System.out.println("Username check->"+usercheck1);
			try
			{
				usercheck2 = customerService.findByUsername(mavCustomerMaster.getEmailId());
			}
			catch(UsernameNotFoundException e)
			{
				System.out.println("New User!!");
			}
			System.out.println("User emailId check->"+usercheck2);
			if(usercheck1==null && usercheck2==null)
			{
				String pwd = mavCustomerMaster.getUserPassword();
				System.out.println("PWD before->"+pwd);
				pwd = passwordEncoder.encode(pwd);
				System.out.println("PWD AFTERRR->"+pwd);
				mavCustomerMaster.setUserPassword(pwd);
				customerService.createMavCustomerMaster(mavCustomerMaster);
				return "redirect:/registration?success";
			}
			else
			{
				return "redirect:/registration?failure";
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception ->"+e);
			return "redirect:/registration?failed";
		}
	}
}
