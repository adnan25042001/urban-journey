package com.NotifEaze.NotifEaze.service.impl;

import org.springframework.stereotype.Service;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.EmailService;

@Service
public class GupshupEmailServiceImpl implements EmailService {

	private GupshupMock gupshupMock;

	public GupshupEmailServiceImpl() {
		this.gupshupMock = new GupshupMock();
	}

	@Override
	public BaseEmailResponse sendEmail(String to, String subject, String body) {

		String data = gupshupMock.getMockedEmailResponse("Email1");

		System.out.println(data);

		BaseEmailResponse response = new BaseEmailResponse(true, data);

		return response;
	}

}
