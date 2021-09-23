package com.barclays.payment.Service;

import com.barclays.payment.model.Account;
import java.util.*;

import org.springframework.stereotype.Service;

public interface AccountService {
	public List<Account> getAccountBySeqId(Integer SequenceId);
}
