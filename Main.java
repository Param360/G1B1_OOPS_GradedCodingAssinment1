package com.greatlearning.departments;

public class Main {

	public static void main(String[] args) {
		
		HrDepartment hrdepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();
        AdminDepartment adminDepartment = new AdminDepartment();
         
	 System.out.println("Welcome to "+ adminDepartment.departmentName());
	 System.out.println(adminDepartment.getTodaysWork());
	 System.out.println(adminDepartment.getWorkDeadline());
	 System.out.println(adminDepartment.isTodayAHoliday());
	 System.out.println();
	 
 System.out.println("wecome to "+ hrdepartment.departmentName());
 hrdepartment.doActivity();
 System.out.println(hrdepartment.getTodaysWork());
 System.out.println(hrdepartment.getWorkDeadline());
 System.out.println(hrdepartment.isTodayAHoliday());
 System.out.println();
 
 System.out.println("Welcome to "+ techDepartment.departmentName());
 System.out.println(techDepartment.getTodaysWork());
 System.out.println(techDepartment.getWorkDeadline());
 System.out.println(techDepartment.getTechStackInformation());
 System.out.println(techDepartment.isTodayAHoliday());
	}
	}
