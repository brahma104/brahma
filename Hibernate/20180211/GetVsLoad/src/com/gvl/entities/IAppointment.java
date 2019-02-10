package com.gvl.entities;

import java.util.Date;

public interface IAppointment {
	public int getAppointmentNo();

	public void setAppointmentNo(int appointmentNo);

	public String getPatientName();

	public void setPatientName(String patientName);

	public String getDoctor();

	public void setDoctor(String doctor);

	public Date getAppointmentDate();

	public void setAppointmentDate(Date appointmentDate);

	public String getDescription();

	public void setDescription(String description);

	public String getMobileNo();

	public void setMobileNo(String mobileNo);
}
