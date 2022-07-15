package com.maveric.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maveric.model.DisputeCustomerDetails;
import com.maveric.repository.DisputeCustomerDetailsRepository;

@Service
public class DisputeCustomerDetailsServiceImpl implements DisputeCustomerDetailsService {
	
	@Autowired
	DisputeCustomerDetailsRepository disputeCustomerDetailsRepo;

	@Override
	public DisputeCustomerDetails createDisputeCustomerDetails(DisputeCustomerDetails disputeCustomerDetails) {
		return disputeCustomerDetailsRepo.save(disputeCustomerDetails);
	}

	@Override
	public DisputeCustomerDetails findDisputeCustomerDetailsById(int disputeId) {
		return disputeCustomerDetailsRepo.findById(disputeId).orElse(null);
	}

	@Override
	public List<DisputeCustomerDetails> findAllDisputeCustomerDetails() {
		return disputeCustomerDetailsRepo.findAll();
	}

	@Override
	public DisputeCustomerDetails updateDisputeCustomerDetails(DisputeCustomerDetails disputeCustomerDetails) {
		DisputeCustomerDetails updatedDisputeCustomerDetails=  null;
		int disputeCustomerId = disputeCustomerDetails.getDisputeId();
		DisputeCustomerDetails disputeCustomerDetailsToBeUpdated = disputeCustomerDetailsRepo.findById(disputeCustomerId).orElse(null);
		if(disputeCustomerDetailsToBeUpdated != null) {
			updatedDisputeCustomerDetails = disputeCustomerDetailsRepo.save(disputeCustomerDetails);
		}

		return updatedDisputeCustomerDetails;
	}

	@Override
	public void deleteDisputeCustomerDetails(int disputeId) {
		DisputeCustomerDetails disputeCustomerDetailsToBeDeleted = disputeCustomerDetailsRepo.findById(disputeId).orElse(null);
		if(disputeCustomerDetailsToBeDeleted != null) {
			disputeCustomerDetailsRepo.deleteById(disputeId);
		}
		
	}

}
