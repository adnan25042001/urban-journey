package com.NotifEaze.NotifEaze.service.impl;

import org.springframework.stereotype.Service;

import com.NotifEaze.NotifEaze.dto.BasePushNotificationResponse;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.PushNotificationService;

@Service
public class PushNotificationServiceImpl implements PushNotificationService {

	private GupshupMock gupshupMock;

	public PushNotificationServiceImpl() {
		this.gupshupMock = new GupshupMock();
	}

	@Override
	public BasePushNotificationResponse sendNotification(String fcmToken, String message) {

		String data = gupshupMock.getMockedPushNotificationResponse("FCMToken1");

		System.out.println(data);

		BasePushNotificationResponse response = new BasePushNotificationResponse(true, data);

		return response;
	}

}
