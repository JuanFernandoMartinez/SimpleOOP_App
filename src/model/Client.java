package model;

public class Client {
	
	//constants 
	
	private static final int NOMRMAL = 0;
	private static final int SILVER = 1;
	private static final int GOLD = 2;
	private static final int PLATINUM = 3;
	
	//variables
	
	private String name;
	private String id;
	private int type;
	private Date expeditionDate;
	
	// constructor 
	
	public Client(String name, String id, int type, Date date){
		this.name = name;
		this.id = id;
		this.type = type;
		this.expeditionDate = date;
	}
	
	// getters and setters
	
	public String getName(){
		return name;
	}
	public void setName(String value){
		name = value;
	}
	public String getId(){
		return id;
	}
	public void setId(String value){
		id = value;
	}
	public int getType(){
		return type;
	}
	public void setType(int value){
		type = value;
	}
	public Date getDate(){
		return expeditionDate;
	}
	public void setDate(Date value){
		expeditionDate = value;
	}
	
}