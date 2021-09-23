package com.barclays.payment.Login;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barclays.payment.model.RegisterBillers;

public interface RegisterBillersDao extends JpaRepository<RegisterBillers, Integer>{
	@Query("SELECT u FROM RegisterBillers u WHERE u.AccountNumber = :AccountNumber")
	List<RegisterBillers> findByAccountNumber(@Param("AccountNumber") Integer AccountNumber);
}
