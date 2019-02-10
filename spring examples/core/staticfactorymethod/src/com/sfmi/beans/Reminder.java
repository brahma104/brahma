package com.sfmi.beans;

import java.util.Calendar;

public class Reminder {
	private String notes;
	private Calendar schedule;
	private boolean snooze;

	public void show() {
		System.out.println("Reminder [notes=" + notes + ", schedule=" + schedule + ", snooze=" + snooze + "]");
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setSchedule(Calendar schedule) {
		this.schedule = schedule;
	}

	public void setSnooze(boolean snooze) {
		this.snooze = snooze;
	}

}
