package com.maveric.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
		String pwd = mavCustomerMaster.getUserPassword();
		System.out.println("PWD before->"+pwd);
		pwd = passwordEncoder.encode(pwd);
		System.out.println("PWD AFTERRR->"+pwd);
		mavCustomerMaster.setUserPassword(pwd);
		customerService.createMavCustomerMaster(mavCustomerMaster);
		return "redirect:/registration?success";
	}
}
