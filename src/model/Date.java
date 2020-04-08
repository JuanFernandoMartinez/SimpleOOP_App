package model;

public class Date{
	private int year;
	private int month;
	private int day;
	
	/**
		creates a Date object <br>
		<b>pre:</b> <br>
		<b>post:</b> creates an Date object with custom value <br>
		@param year int !null. int >0
		@param month int !null. in range(1,12)
		@param day int !null. in range(1,31)
	*/
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int value){
		year = value;
	}
	public int getMonth(){
		return month;
	}
	public void setMonth(int value){
		month = value;
	}
	public int getDay(){
		return day;
	}
	public void setDay(int value){
		day = value;
	}
}