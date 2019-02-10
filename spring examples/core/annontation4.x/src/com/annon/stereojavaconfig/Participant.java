package com.annon.stereojavaconfig;

// no source code
public class Participant {
	private int participantNo;
	private String participantName;

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	@Override
	public String toString() {
		return "Participant [participantNo=" + participantNo + ", participantName=" + participantName + "]";
	}

}
