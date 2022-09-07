/**
 * 
 */
package com.tutorials.sid.spring.collection.List;

import java.util.List;

/**
 * @author Lenovo
 *
 */
public class Hospital {
	private String name;
	private List<String> department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDepartment() {
		return department;
	}

	public void setDepartment(List<String> department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", department=" + department + "]";
	}

}
