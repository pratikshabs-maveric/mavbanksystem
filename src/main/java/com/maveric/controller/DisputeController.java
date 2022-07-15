package com.maveric.controller;
import java.util.*;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maveric.model.DisputeCustomerDetails;
import com.maveric.model.DisputeReasons;
import com.maveric.model.DisputeTransactionDetails;
import com.maveric.model.MavCustomerMaster;
import com.maveric.service.DisputeCustomerDetailsService;
import com.maveric.service.DisputeReasonsService;
import com.maveric.service.DisputeTransactionDetailsService;
import com.maveric.service.MavCustomerMasterService;


@Controller
public class DisputeController {
	
	@Autowired
	DisputeCustomerDetailsService disputeCustomerDetailsService;
	
	@Autowired
	DisputeReasonsService disputeReasonsService;
	
	@Autowired
	DisputeTransactionDetailsService disputeTransactionDetailsService;
	
	@Autowired
	MavCustomerMasterService mavCustomerMasterService;

	
	@RequestMapping(value = "addDisputeDetails", method = RequestMethod.POST )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public ModelAndView addDisputeCustomerDetails(DisputeCustomerDetails disputeCustomerDetails,DisputeReasons disputeReasons,
			DisputeTransactionDetails disputeTransactionDetails) {
		ModelAndView modelAndView = new ModelAndView("disputeSuccess");
		ArrayList<DisputeTransactionDetails> disputeTransactionList = new ArrayList<DisputeTransactionDetails>();
		disputeTransactionList.add(disputeTransactionDetails);
		/*DisputeTransactionDetails cpy = new DisputeTransactionDetails();
		cpy.setTransactionDate(disputeTransactionDetails.getTransactionDate());
		cpy.setMerchantAtmName("ATM NAME FROM JAVA");
		cpy.setDisputeAmount(123);
		cpy.setTransactionAmount(54323);
		cpy.setTransactionIntimationDetails("jgfg");
		disputeTransactionList.add(cpy);
		System.out.println("Size of list ->"+disputeTransactionList.size()); */
		disputeCustomerDetails.setDisputeReasons(disputeReasons);
		disputeCustomerDetails.setDisputeTransactionDetails(disputeTransactionList);
		DisputeCustomerDetails addedDisputeCustomerDetails = disputeCustomerDetailsService.createDisputeCustomerDetails(disputeCustomerDetails);
		
		/*disputeTransactionDetails.setDisputeId(addedDisputeCustomerDetails.getDisputeId());
		DisputeTransactionDetails addedDisputeTransactionDetails = disputeTransactionDetailsService.createDisputeTransactionDetailsService(disputeTransactionDetails);
		
		disputeReasons.setDisputeId(addedDisputeCustomerDetails.getDisputeId());
		DisputeReasons addedDisputeReasons  = disputeReasonsService.createDisputeReasons(disputeReasons); */
		
		modelAndView.addObject("disputeCustomerDetails", addedDisputeCustomerDetails);
		//modelAndView.addObject("disputeReasons", addedDisputeReasons);
		//modelAndView.addObject("disputeTransactionDetails", addedDisputeTransactionDetails);
		return modelAndView;
	}
	
	@RequestMapping(value = "addMasterCustomerDetails", method = RequestMethod.POST )
	public ModelAndView addMasterCustomerDetails(MavCustomerMaster mavCustomerMaster) {
		ModelAndView modelAndView = new ModelAndView("disputeSuccess");
		
		mavCustomerMasterService.createMavCustomerMaster(mavCustomerMaster);
		
		return modelAndView;
	}
}
