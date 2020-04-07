package model;

public class Load {
	
	private final static int dangerous = 0;
	private final static int perishable = 1;
	private final static int nonperishable = 2;
	
	
	private int boxes;
	private double weightPerBox;
	private Client client;
	private double totalWeight;
	private int type;
	
	// constructor
	
	public Load(int boxes, double weightPerBox, Client client, int type){
		this.boxes = boxes;
		this.weightPerBox = weightPerBox;
		this.client = client;
		this.type = type;
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
	@params: <br/>
	
	*/
	public double getTotalWeight(){
		totalWeight = boxes*weightPerBox;
		return totalWeight;
	}
	
}