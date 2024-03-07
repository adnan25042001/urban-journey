package com.NotifEaze.NotifEaze.service.impl;

import org.springframework.stereotype.Service;

import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.dto.SmsDeliveryStatus;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.mock.KayleraMock;
import com.NotifEaze.NotifEaze.service.SmsService;

@Service
public class KayleraSmsServiceImpl implements SmsService {

	private GupshupMock gupshupMock;
	private KayleraMock kayleraMock;

	public KayleraSmsServiceImpl() {
		this.gupshupMock = new GupshupMock();
		this.kayleraMock = new KayleraMock();
	}

	@Override
	public BaseSmsResponse sendSms(String phoneNumber, String message) {

		String data = kayleraMock.getMockedSmsResponse("123456");

		BaseSmsResponse response = new BaseSmsResponse(true, data);

		return response;
	}

	@Override
	public SmsDeliveryStatus checkDeliveryStatus(String messageId) {

		String data = gupshupMock.getMockedSmsDeliveryStatus("MessageId2");

		SmsDeliveryStatus response = new SmsDeliveryStatus(true, data);

		return response;

	}

}
