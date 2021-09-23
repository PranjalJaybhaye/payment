package com.barclays.payment.Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barclays.payment.model.Bills;

@Repository
public interface BillsDao extends JpaRepository<Bills, Integer>{

}
