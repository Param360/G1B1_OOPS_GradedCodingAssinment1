package com.greatlearning.departments;

public  class HrDepartment extends SuperDepartment {
	public String departmentName() {
		 return "Hr department";
	}
	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return " Fill today’s timesheet and mark your attendance";}
		
    public String getWorkDeadline() {
    	return " Complete by EOD";
    }
    public String isTodayAHoliday() {
    	return "today is not a holiday";
    	
    }
    public void  doActivity() {
    	System.out.println("team Lunch");
    }
	
	}

