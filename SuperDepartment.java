package com.greatlearning.departments;

public abstract class SuperDepartment {
	
	public abstract String departmentName();
	public abstract String getTodaysWork();
	public abstract String getWorkDeadline();
	public abstract String isTodayAHoliday();

	public String departmentName1 () {
		return "Super Department";
	}
	public String getTodaysWork1 (){
		return "No Work as of now" ;
	}
	public String getWorkDeadline1 () {
		return " Nil" ;
	}
	public String isTodayAHoliday1 () {
	 return "Today is not a holiday" ;
}
	
	
}
