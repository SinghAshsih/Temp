package com.interview;

import java.util.List;

public class Student {
	Integer id;
	String name;
	List<Integer> deptIds;

	public Student() {
		super();
	}

	public Student(Integer id, String name, List<Integer> deptIds) {
		super();
		this.id = id;
		this.name = name;
		this.deptIds = deptIds;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getDeptIds() {
		return deptIds;
	} 

	public void setDeptIds(List<Integer> deptIds) {
		this.deptIds = deptIds;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", deptIds=" + deptIds + "]";
	}

}
