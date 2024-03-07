package com.NotifEaze.NotifEaze.controller;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;
import com.NotifEaze.NotifEaze.dto.BasePushNotificationResponse;
import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.service.PushNotificationService;
import com.NotifEaze.NotifEaze.service.impl.GupshupEmailServiceImpl;
import com.NotifEaze.NotifEaze.service.impl.GupshupSmsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/communication")
public class CommunicationController {

	@Autowired
	private GupshupSmsServiceImpl gupshupSmsServiceImpl;

	@Autowired
	private GupshupEmailServiceImpl gupshupEmailServiceImpl;

	@Autowired
	private PushNotificationService pushNotificationService;

	@PostMapping("/send-sms")
	public ResponseEntity<BaseSmsResponse> sendSms(@RequestParam String phoneNumber, @RequestParam String message) {
		// Call the service that sends the SMS.
		BaseSmsResponse response = gupshupSmsServiceImpl.sendSms(phoneNumber, message);

		// Return the response.
		return ResponseEntity.ok(response);
	}

	@PostMapping("/send-email")
	public ResponseEntity<BaseEmailResponse> sendEmail(@RequestParam String to, @RequestParam String subject,
			@RequestParam String body) {
		// Call the service that sends the email.
		BaseEmailResponse response = gupshupEmailServiceImpl.sendEmail(to, subject, body);

		// Return the response.
		return ResponseEntity.ok(response);
	}

	@PostMapping("/send-notification")
	public ResponseEntity<BasePushNotificationResponse> sendNotification(@RequestParam String token,
			@RequestParam String message) {
		// Call the service that sends the push notification.
		BasePushNotificationResponse response = pushNotificationService.sendNotification(token, message);

		// Return the response.
		return ResponseEntity.ok(response);
	}

}
