package com.xworkz.springmail.service;

public interface MailService {
	boolean sendByMailId(String receiverId, String subject, String body);
}
