package com.maveric.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.maveric.model.MavCustomerMaster;
import com.maveric.repository.MavCustomerMasterRepository;


@Service
public class MavCustomerMasterServiceImpl implements MavCustomerMasterService{
	
	
	private MavCustomerMasterRepository mavCustomerMasterRepo;
	

	
	public MavCustomerMasterServiceImpl(MavCustomerMasterRepository mavCustomerMasterRepo)
	{
		super();
		this.mavCustomerMasterRepo = mavCustomerMasterRepo;
	}
	
	@Override
	public MavCustomerMaster createMavCustomerMaster(MavCustomerMaster mavCustomerMaster) {
		MavCustomerMaster mavCus = new MavCustomerMaster(mavCustomerMaster.getCustomerName(),mavCustomerMaster.getEmailId(),mavCustomerMaster.getPhoneNumber()
				,mavCustomerMaster.getUserName(),mavCustomerMaster.getUserPassword());
		return mavCustomerMasterRepo.save(mavCustomerMaster);
	}

	@Override
	public MavCustomerMaster findMavCustomerMasterById(long customerId) {
		return mavCustomerMasterRepo.findById(customerId).orElse(null);
	}

	@Override
	public List<MavCustomerMaster> findAllMavCustomerMaster() {
		return mavCustomerMasterRepo.findAll();
	}

	@Override
	public MavCustomerMaster updateMavCustomerMaster(MavCustomerMaster mavCustomerMaster) {
		MavCustomerMaster updatedMavCustomerMaster=  null;
		long customerId = mavCustomerMaster.getCustomerId();
		MavCustomerMaster mavCustomerMasterToBeUpdated = mavCustomerMasterRepo.findById(customerId).orElse(null);
		if(mavCustomerMasterToBeUpdated != null) {
			updatedMavCustomerMaster = mavCustomerMasterRepo.save(mavCustomerMaster);
		}

		return updatedMavCustomerMaster;
	}

	@Override
	public void deleteMavCustomerMaster(long customerId) {
		MavCustomerMaster mavCustomerMasterToBeDeleted = mavCustomerMasterRepo.findById(customerId).orElse(null);
		if(mavCustomerMasterToBeDeleted != null) {
			mavCustomerMasterRepo.deleteById(customerId);
		}
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MavCustomerMaster customer = null;
		System.out.println("UNSERRNAMEE ->>> "+ username);
		if(username.contains("@"))
		{
			customer = mavCustomerMasterRepo.findByEmailId(username);
		}
		else
		{
			customer = mavCustomerMasterRepo.findByUserName(username);
		} 
		if(customer == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new com.maveric.model.UserPrincipal(customer);	
	}

	@Override
	public MavCustomerMaster findByUsername(String userName) {
		MavCustomerMaster customer = null;
		System.out.println("UNSERRNAMEE ->>> "+ userName);
		if(userName.contains("@"))
		{
			customer = mavCustomerMasterRepo.findByEmailId(userName);
		}
		else
		{
			customer = mavCustomerMasterRepo.findByUserName(userName);
		} 
		if(customer == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return customer;
	}
	

}
