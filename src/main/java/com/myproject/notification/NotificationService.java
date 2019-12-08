package com.myproject.notification;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationService {

	@RequestMapping("/getNotifications")
	public List<Notification> getNotification()
	{
		Date currentDateTime = new Date();
		Notification notification = new Notification(1, "Hello, your first notification", currentDateTime);
		List<Notification> listNotification = new ArrayList<Notification>();
		listNotification.add(notification);
		return listNotification;
	}
	
	
}
