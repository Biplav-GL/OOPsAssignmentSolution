package com.gl.oopsassignment.departments;

//Defining TechDepartment Class which is extending the SuperDepartment SuperClass
public class TechDepartment extends SuperDepartment {

	public String departmentName() {
		return " Tech Department ";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public String getTechStackInformation() {
		return "core Java";
	}
}