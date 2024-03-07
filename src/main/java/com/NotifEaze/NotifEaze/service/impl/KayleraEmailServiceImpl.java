package com.NotifEaze.NotifEaze.service.impl;

import org.springframework.stereotype.Service;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;
import com.NotifEaze.NotifEaze.mock.KayleraMock;
import com.NotifEaze.NotifEaze.service.EmailService;

@Service
public class KayleraEmailServiceImpl implements EmailService {

	private KayleraMock kayleraMock;

	public KayleraEmailServiceImpl() {
		this.kayleraMock = new KayleraMock();
	}

	@Override
	public BaseEmailResponse sendEmail(String to, String subject, String body) {

		String data = kayleraMock.getMockedEmailResponse("test1");

		BaseEmailResponse response = new BaseEmailResponse(true, data);

		return response;
	}

}
