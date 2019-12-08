package com.myproject.notification;

import java.util.Date;

public class Notification {

	private int id;
	private String notificationText;
	private Date notificationDateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNotificationText() {
		return notificationText;
	}
	public void setNotificationText(String notificationText) {
		this.notificationText = notificationText;
	}
	public Date getNotificationDateTime() {
		return notificationDateTime;
	}
	public void setNotificationDateTime(Date notificationDateTime) {
		this.notificationDateTime = notificationDateTime;
	}
	
	
	@Override
	public String toString() {
		return "Notification [id=" + id + ", notificationText=" + notificationText + ", notificationDateTime="
				+ notificationDateTime + ", notificationType=" + "]";
	}
	
	public Notification(int id, String notificationText, Date notificationDateTime) {
		super();
		this.id = id;
		this.notificationText = notificationText;
		this.notificationDateTime = notificationDateTime;
	}
	
	public Notification() {
		super();
	}
	
	
	
}
