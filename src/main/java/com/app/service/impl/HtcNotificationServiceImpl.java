package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;
@Component
@Profile("htc")
public class HtcNotificationServiceImpl implements INotificationService {

	public void notification() {
		System.out.println("only for Htc profile");

	}

}
