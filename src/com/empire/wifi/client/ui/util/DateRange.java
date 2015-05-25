package com.empire.wifi.client.ui.util;


public enum DateRange{
	NOW("Now"),
	TODAY("Today"),
	YESTERDAY("Yesterday"),
	THISWEEK("Last 7 Days"),
	LASTMONTH("Last Month"),
	THISMONTH("This Month"),
	THISQUARTER("Last 3 Months"),
	HALFYEAR("Last 6 Months"),
	THISYEAR("This Year"),
	SPECIFIC("Specific Date"),
	INBETWEEN("DateRange");
	
	
	private String displayName;

	DateRange(String displayName){
		this.displayName = displayName;
	}
	
	public static DateRange getDateRange(String name){
		for(DateRange type: DateRange.values()){
			if(type.displayName.equals(name)){
				return type;
			}
		}
		return null;
	}

}