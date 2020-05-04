package com.xworkz.springmail.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class MailServiceImpl implements MailService {

	private static final Logger logger = Logger.getLogger(MailServiceImpl.class);

	@Autowired
	private MailSender mailSender;

	public MailServiceImpl() {
		super();
		logger.info(this.getClass().getSimpleName() + "\t object created");

	}

	@Override
	public boolean sendByMailId(String receiverId, String subject, String body) {
		logger.info("invoked  sendByMailId() inside MailServiceImpl ");
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(receiverId);
		mailMessage.setSubject(subject);
		mailMessage.setText(body);
		try {
			mailSender.send(mailMessage);
			logger.info("Mail sent successfully");
			return true;

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		return false;
	}

}
