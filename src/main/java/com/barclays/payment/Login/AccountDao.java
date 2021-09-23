package com.barclays.payment.Login;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barclays.payment.model.Account;
import com.barclays.payment.model.RegisterBillers;

public interface AccountDao extends JpaRepository<Account, Integer> {
	@Query("SELECT u FROM Account u WHERE u.SequenceiD = :SequenceId")
	List<Account> findBySeqId(@Param("SequenceId") Integer SequenceId);
}
