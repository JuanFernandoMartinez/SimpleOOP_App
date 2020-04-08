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
	
	/** 
		Created an object type Client <br>
		<b>pre:</b> <br>
		<b>post:</b> creates an object type Client with custom values <br>
		@param name a String !empty. !null
		@param id a String !empty. !null 
		@param date object type Date !null 
		@param type int in range (0,3) 
	*/
	public Client(String name, String id,  Date date,int type){
		this.name = name;
		this.id = id;
		this.expeditionDate = date;
		this.type = type;
	}
	
	/** 
		Creates an empty client object <br>
		<b>pre:<b/> <br>
		<b>post:</b> creates an empty object <br>
		
	*/
	public Client(){
		this.name = "";
		this.id = "";
		this.expeditionDate = new Date(0,0,0);
		this.type = 0;
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






