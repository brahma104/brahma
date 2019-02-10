package com.aim.single.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "project")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "project_type")
@DiscriminatorValue("general")
public class Project implements Serializable {
	@Id
	@GeneratedValue(generator = "increment_gen")
	@GenericGenerator(name = "increment_gen", strategy = "increment")
	@Column(name = "project_no")
	protected int projectNo;
	@Column(name = "project_nm")
	protected String projectName;
	@Column(name = "contractor_nm")
	protected String contractor;
	@Column(name = "work_type")
	protected String workType;

	public int getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(int projectNo) {
		this.projectNo = projectNo;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractor == null) ? 0 : contractor.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		result = prime * result + projectNo;
		result = prime * result + ((workType == null) ? 0 : workType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (contractor == null) {
			if (other.contractor != null)
				return false;
		} else if (!contractor.equals(other.contractor))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		if (projectNo != other.projectNo)
			return false;
		if (workType == null) {
			if (other.workType != null)
				return false;
		} else if (!workType.equals(other.workType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project [projectNo=" + projectNo + ", projectName=" + projectName + ", contractor=" + contractor
				+ ", workType=" + workType + "]";
	}

}
