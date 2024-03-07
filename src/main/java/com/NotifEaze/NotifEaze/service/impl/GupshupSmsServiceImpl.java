package com.NotifEaze.NotifEaze.service.impl;

import org.springframework.stereotype.Service;

import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.dto.SmsDeliveryStatus;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.SmsService;

@Service
public class GupshupSmsServiceImpl implements SmsService {

	private GupshupMock gupshupMock;

	public GupshupSmsServiceImpl() {
		this.gupshupMock = new GupshupMock();
	}

	@Override
	public BaseSmsResponse sendSms(String phoneNumber, String message) {

		String data = gupshupMock.getMockedSmsResponse("MessageId1");

		BaseSmsResponse response = new BaseSmsResponse(true, data);

		return response;
	}

	@Override
	public SmsDeliveryStatus checkDeliveryStatus(String messageId) {

		String data = gupshupMock.getMockedSmsDeliveryStatus("MessageId1");

		SmsDeliveryStatus response = new SmsDeliveryStatus(true, data);

		return response;

	}

}
