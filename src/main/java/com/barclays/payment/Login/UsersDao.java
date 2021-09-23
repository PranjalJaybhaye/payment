package com.barclays.payment.Login;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barclays.payment.model.Users;

public interface UsersDao extends JpaRepository<Users, String>{

}
