package com.xworkz.springmail.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.springmail.service.MailService;

@Component
@RequestMapping("/")
public class MailController {

	private static final Logger logger = Logger.getLogger(MailController.class);

	@Autowired
	private MailService mailService;

	public MailController() {
		super();
		logger.info(this.getClass().getSimpleName() + "\t object created");
	}

	@RequestMapping(value = "/sendMail.do", method = RequestMethod.POST)
	public String sendMail(@RequestParam String receiverId, @RequestParam String subject, @RequestParam String body,
			Model model) {
		logger.info("invoked sendMail() inside MailController ");
		logger.info("receiverId is :" + receiverId);
		logger.info("subject is " + subject);
		logger.info("body is " + body);
		this.mailService.sendByMailId(receiverId, subject, body);
		model.addAttribute("msg", receiverId);
		return "/Success.jsp";

	}

}
