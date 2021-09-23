package com.barclays.payment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
		@RequestMapping("/")
		public String Home() {
			
			return "NewFile.jsp";
		}
		@RequestMapping("/account-holder")
		public String Home2() {
			return "accountholderview.jsp";
		}
}
