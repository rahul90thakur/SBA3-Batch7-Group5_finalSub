package com.wellsfargo.batch7.group5.ibs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch7.group5.ibs.entities.KycDetails;
import com.wellsfargo.batch7.group5.ibs.entities.LoginInfo;

@Repository
public interface LoginInfoRepo extends JpaRepository<LoginInfo, Integer>{
	
	boolean existsByUserName(String uci);
	LoginInfo findByUserName(String uci);

}
