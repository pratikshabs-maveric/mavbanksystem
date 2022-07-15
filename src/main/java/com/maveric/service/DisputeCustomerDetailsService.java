package com.maveric.service;

import java.util.List;

import com.maveric.model.DisputeCustomerDetails;

public interface DisputeCustomerDetailsService {

	DisputeCustomerDetails createDisputeCustomerDetails(DisputeCustomerDetails disputeCustomerDetails);
	DisputeCustomerDetails findDisputeCustomerDetailsById(int disputeId);
	List<DisputeCustomerDetails> findAllDisputeCustomerDetails();
	DisputeCustomerDetails updateDisputeCustomerDetails(DisputeCustomerDetails disputeCustomerDetails);
	void deleteDisputeCustomerDetails(int disputeId);
}
