package com.maveric.service;

import java.util.List;

import com.maveric.model.MavCustomerMaster;

public interface MavCustomerMasterService {
	MavCustomerMaster createMavCustomerMaster(MavCustomerMaster mavCustomerMaster);
	MavCustomerMaster findMavCustomerMasterById(int customerId);
	List<MavCustomerMaster> findAllMavCustomerMaster();
	MavCustomerMaster updateMavCustomerMaster(MavCustomerMaster mavCustomerMaster);
	void deleteMavCustomerMaster(int customerId);
}
