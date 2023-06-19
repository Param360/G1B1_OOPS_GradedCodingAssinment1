package com.greatlearning.departments;

public  class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		 return "Tech Department";
	}
	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete coding of module 1" ;
  
   }
   public String getWorkDeadline() {
   	return " Complete by EOD ";
   }
   public String isTodayAHoliday() {
   	return "today is not a holiday";
   }
   public String getTechStackInformation () {
	   	return "core Java";
   }


	
}