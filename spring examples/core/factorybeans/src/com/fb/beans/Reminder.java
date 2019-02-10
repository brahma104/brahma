package com.fb.beans;

import java.util.Calendar;

public class Reminder {
	private String notes;
	private Calendar schedule;
	private boolean snooze;

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setSchedule(Calendar schedule) {
		this.schedule = schedule;
	}

	public void setSnooze(boolean snooze) {
		this.snooze = snooze;
	}

	public void reminder() {
		System.out.println("Reminder [notes=" + notes + ", schedule=" + schedule.getTime() + ", snooze=" + snooze + "]");
	}

}
