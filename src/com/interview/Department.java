package com.interview;

public class Department {
	Integer departmentId;
	String deptName;

	public Department(Integer departmentId, String deptName) {
		super();
		this.departmentId = departmentId;
		this.deptName = deptName;
	}

	public Department() {
		super();
	}

	
	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", deptName=" + deptName + "]";
	}
}
