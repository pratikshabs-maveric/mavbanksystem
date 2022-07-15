package com.maveric.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maveric.model.DisputeTransactionDetails;
import com.maveric.repository.DisputeTransactionDetailsRepository;

@Service
public class DisputeTransactionDetailsServiceImpl implements DisputeTransactionDetailsService{
	
	@Autowired
	DisputeTransactionDetailsRepository disputeTransactionDetailsRepo;
	
	@Override
	public DisputeTransactionDetails createDisputeTransactionDetailsService(DisputeTransactionDetails disputeTransactionDetails) {
		return disputeTransactionDetailsRepo.save(disputeTransactionDetails);
	}

	@Override
	public DisputeTransactionDetails findDisputeTransactionDetailsServiceById(int transactionId) {
		return disputeTransactionDetailsRepo.findById(transactionId).orElse(null);
	}

	@Override
	public List<DisputeTransactionDetails> findAllDisputeTransactionDetailsService() {
		return disputeTransactionDetailsRepo.findAll();
	}

	@Override
	public DisputeTransactionDetails updateDisputeTransactionDetailsService(DisputeTransactionDetails disputeTransactionDetails) {
		DisputeTransactionDetails updatedDisputeTransactionDetails=  null;
		int disputeTransactionId = disputeTransactionDetails.getTransactionId();
		DisputeTransactionDetails disputeTransactionDetailsToBeUpdated = disputeTransactionDetailsRepo.findById(disputeTransactionId).orElse(null);
		if(disputeTransactionDetailsToBeUpdated != null) {
			updatedDisputeTransactionDetails = disputeTransactionDetailsRepo.save(disputeTransactionDetails);
		}

		return updatedDisputeTransactionDetails;
	}

	@Override
	public void deleteDisputeTransactionDetailsService(int transactionId) {
		// TODO Auto-generated method stub
		
	}

}
