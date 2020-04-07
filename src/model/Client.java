package model;

public class Client {
	
	//constants 
	
	private final static int NOMRMAL = 0;
	private final static int SILVER = 1;
	private final static int GOLD = 2;
	private final static int PLATINUM = 3;
	
	//variables
	
	private String name;
	private String id;
	private int type;
	private Date expeditionDate;
	
	// constructor 
	
	
	public Client(String name, String id,  Date date,int type){
		this.name = name;
		this.id = id;
		this.expeditionDate = date;
		this.type = type;
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
	
	public Date getDate(){
		return expeditionDate;
	}
	public void setDate(Date value){
		expeditionDate = value;
	}
	public int getType(){
		return type;
	}
	public void setType(int value){
		type = value;
	}
	
	
}






