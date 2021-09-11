package com.gl.oopsassignment.departments;

//Defining HrDepartment Class which is extending the SuperDepartment SuperClass
public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return " Hr Department ";
	}

	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public String doActivity() {
		return "team Lunch";
	}
}