package model;

public class Date{
	private int year;
	private int month;
	private int day;
	
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