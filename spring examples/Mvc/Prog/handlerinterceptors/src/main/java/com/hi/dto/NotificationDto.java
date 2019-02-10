package com.hi.dto;

public class NotificationDto {
	protected String notificationMessage;
	protected String status;

	public NotificationDto(String notificationMessage, String status) {
		this.notificationMessage = notificationMessage;
		this.status = status;
	}

	public String getNotificationMessage() {
		return notificationMessage;
	}

	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
