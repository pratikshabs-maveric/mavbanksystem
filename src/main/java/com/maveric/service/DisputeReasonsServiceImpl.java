package com.maveric.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maveric.model.DisputeCustomerDetails;
import com.maveric.model.DisputeReasons;
import com.maveric.repository.DisputeReasonsRepository;

@Service
public class DisputeReasonsServiceImpl implements DisputeReasonsService{
	
	@Autowired
	DisputeReasonsRepository disputeReasonsRepo;
	
	@Override
	public DisputeReasons createDisputeReasons(DisputeReasons disputeReasons) {
		return disputeReasonsRepo.save(disputeReasons);
	}

	@Override
	public DisputeReasons findDisputeReasonsById(int reasonId) {
		return disputeReasonsRepo.findById(reasonId).orElse(null);
	}

	@Override
	public List<DisputeReasons> findAllDisputeReasons() {
		return disputeReasonsRepo.findAll();
	}

	@Override
	public DisputeReasons updateDisputeReasons(DisputeReasons disputeReasons) {
		DisputeReasons updatedDisputeReasons=  null;
		int disputeReasonId = disputeReasons.getReasonId();
		DisputeReasons disputeReasonsToBeUpdated = disputeReasonsRepo.findById(disputeReasonId).orElse(null);
		if(disputeReasonsToBeUpdated != null) {
			updatedDisputeReasons = disputeReasonsRepo.save(disputeReasons);
		}

		return updatedDisputeReasons;
	}

	@Override
	public void deleteDisputeReasons(int reasonId) {
		DisputeReasons disputeReasonsToBeDeleted = disputeReasonsRepo.findById(reasonId).orElse(null);
		if(disputeReasonsToBeDeleted != null) {
			disputeReasonsRepo.deleteById(reasonId);
		}
		
	}

}
