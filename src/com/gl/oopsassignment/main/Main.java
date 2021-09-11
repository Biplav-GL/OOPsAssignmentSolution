package com.gl.oopsassignment.main;

import com.gl.oopsassignment.departments.AdminDepartment;
import com.gl.oopsassignment.departments.HrDepartment;
import com.gl.oopsassignment.departments.TechDepartment;

public class Main {

	public static void main(String[] args) {

		// Creating the AdminDepartment Object
		AdminDepartment admin = new AdminDepartment();

		// Calling the Methods for AdminDepartment
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		// Creating the HrDepartment Object
		HrDepartment hr = new HrDepartment();

		// Calling the Methods for HrDepartment
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();

		// Creating the TechDepartment Object
		TechDepartment techie = new TechDepartment();

		// Calling the Methods for TechDepartment
		System.out.println("Welcome to " + techie.departmentName());
		System.out.println(techie.getTodaysWork());
		System.out.println(techie.getWorkDeadline());
		System.out.println(techie.getTechStackInformation());
		System.out.println(techie.isTodayAHoliday());
		System.out.println();

	}
}
