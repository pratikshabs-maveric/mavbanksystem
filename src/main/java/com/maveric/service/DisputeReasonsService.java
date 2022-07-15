package com.maveric.service;

import java.util.List;

import com.maveric.model.DisputeReasons;

public interface DisputeReasonsService {
	DisputeReasons createDisputeReasons(DisputeReasons disputeReasons);
	DisputeReasons findDisputeReasonsById(int reasonId);
	List<DisputeReasons> findAllDisputeReasons();
	DisputeReasons updateDisputeReasons(DisputeReasons disputeReasons);
	void deleteDisputeReasons(int reasonId);
}
