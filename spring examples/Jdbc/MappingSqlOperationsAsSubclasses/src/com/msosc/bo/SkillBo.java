package com.msosc.bo;

public class SkillBo {
	private int skillNo;
	private String skillName;
	private String technology;

	public SkillBo() {
	}

	public SkillBo(int skillNo, String skillName, String technology) {
		this.skillNo = skillNo;
		this.skillName = skillName;
		this.technology = technology;
	}

	public int getSkillNo() {
		return skillNo;
	}

	public void setSkillNo(int skillNo) {
		this.skillNo = skillNo;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "SkillBo [skillNo=" + skillNo + ", skillName=" + skillName + ", technology=" + technology + "]";
	}

}
