package com.maveric.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maveric.model.MavCustomerMaster;



public interface MavCustomerMasterRepository extends JpaRepository<MavCustomerMaster, Long>{
	MavCustomerMaster findByUserName(String userName);
	MavCustomerMaster findByEmailId(String emailID);
}
