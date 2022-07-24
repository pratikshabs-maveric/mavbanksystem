package com.maveric.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.maveric.model.MavCustomerMaster;

public interface MavCustomerMasterService extends UserDetailsService {
	MavCustomerMaster createMavCustomerMaster(MavCustomerMaster mavCustomerMaster);
	MavCustomerMaster findMavCustomerMasterById(long customerId);
	MavCustomerMaster findByUsername(String userName);
	List<MavCustomerMaster> findAllMavCustomerMaster();
	MavCustomerMaster updateMavCustomerMaster(MavCustomerMaster mavCustomerMaster);
	void deleteMavCustomerMaster(long customerId);
}
