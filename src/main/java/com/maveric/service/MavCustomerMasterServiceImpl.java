package com.maveric.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maveric.model.MavCustomerMaster;
import com.maveric.repository.MavCustomerMasterRepository;

@Service
public class MavCustomerMasterServiceImpl implements MavCustomerMasterService{
	
	@Autowired
	MavCustomerMasterRepository mavCustomerMasterRepo;
	
	@Override
	public MavCustomerMaster createMavCustomerMaster(MavCustomerMaster mavCustomerMaster) {
		return mavCustomerMasterRepo.save(mavCustomerMaster);
	}

	@Override
	public MavCustomerMaster findMavCustomerMasterById(int customerId) {
		return mavCustomerMasterRepo.findById(customerId).orElse(null);
	}

	@Override
	public List<MavCustomerMaster> findAllMavCustomerMaster() {
		return mavCustomerMasterRepo.findAll();
	}

	@Override
	public MavCustomerMaster updateMavCustomerMaster(MavCustomerMaster mavCustomerMaster) {
		MavCustomerMaster updatedMavCustomerMaster=  null;
		int customerId = mavCustomerMaster.getCustomerId();
		MavCustomerMaster mavCustomerMasterToBeUpdated = mavCustomerMasterRepo.findById(customerId).orElse(null);
		if(mavCustomerMasterToBeUpdated != null) {
			updatedMavCustomerMaster = mavCustomerMasterRepo.save(mavCustomerMaster);
		}

		return updatedMavCustomerMaster;
	}

	@Override
	public void deleteMavCustomerMaster(int customerId) {
		MavCustomerMaster mavCustomerMasterToBeDeleted = mavCustomerMasterRepo.findById(customerId).orElse(null);
		if(mavCustomerMasterToBeDeleted != null) {
			mavCustomerMasterRepo.deleteById(customerId);
		}
		
	}

}
