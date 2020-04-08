package model;

public class Load {
	
	private final static int dangerous = 0;
	private final static int perishable = 1;
	private final static int nonperishable = 2;
	
	
	private int boxes;
	private double weightPerBox;
	private Client client;
	private double totalWeight = boxes * weightPerBox;
	private int type;
	
	// constructor
	
	/** 
		creates an Load object <br>
		<b>pre:</b> <br>
		<b>post:</b> creates an Load object with custom values <br>
		@param boxes int !null
		@param weightPerBox double !null
		@param client object type Client !null. !empty
		@param type int in range(0,2);
	*/
	public Load(int boxes, double weightPerBox, Client client, int type){
		this.boxes = boxes;
		this.weightPerBox = weightPerBox;
		this.client = client;
		this.type = type;
	}
	
	
	/**
		creates an Load object <br>
		<b>pre:</b> <br>
		<b>post:</b> creates an empty Load object
	*/
	public Load(){
		this.boxes = 0;
		this.weightPerBox = 0;
		this.client = new Client();
		this.type = 2;
	}
	
	
	//getters and setters
	
	public int getBoxes(){
		return boxes;
	}
	
	public void setBoxes(int value){
		boxes = value;
	}
	
	public double getWeigth(){
		return weightPerBox;
	}
	
	public void setWeigth(double value){
		weightPerBox = value;
	}
	
	public Client getClient(){
		return client;
	}
	
	public void setClient(Client value){
		client = value;
	}
	
	public int getType(){
		return type;
	}
	
	public void setType(int value){
		type = value;
	}
	/**
	getTotalWeight
	<b>description: </b> this method will calculate the total weight based on the box Quantity and the weight Per Box <br/>
	<b>pre:</b> the class must be create and the attribs boxes and weightPerBox must be instantiated <br/>
	<b>post:</b> return a double which is the total weight of the load <br/>
	@return double with the total weight
	
	*/
	public double getTotalWeight(){
		totalWeight = boxes*weightPerBox;
		return totalWeight;
	}
	
	
	
	/** 
		Calculate the total price which must be paid by the client <br>
		<b>pre:</b> the object must has been initializated <br>
		<b>post:</b> Returns a double with the total price that the client must to pay <br>
		@return double with the total price
	*/
	public double getTotalPrice(){
		totalWeight = boxes*weightPerBox;
		double totalPrice;
		int typeClient = client.getType();
		if (this.type == dangerous){
			totalPrice = 390000*totalWeight;
		} else if (this.type == perishable){
			totalPrice = 250000*totalWeight;
		} else {
			totalPrice = 80000*totalWeight;
		}
		
		switch(typeClient){
			case 0 : break;
			case 1 : if (this.type == perishable){totalPrice -= totalPrice*0.015;} break;
			case 2 : if (this.type == perishable || this.type == nonperishable){totalPrice -= totalPrice*0.03;} break;
			case 3 : totalPrice -= totalPrice*0.05; break;
		}
		return totalPrice;
	}
	
}









