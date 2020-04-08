package model;

public class Ship{
	public String name;
	public Client[] clients;
	public Load[] loads;
	public double maxCapacity;
	public double minCapacity;
	
	// contrructor
	
	/** 
		Creates a new object type ship <br>
		<b>pre:</b> <br>
		<b>post:</b> creates a new ship object with custom values <br>
		@param name a string which can't be empty 
		@param clients an array of type Client. !null . !empty
		@param loads an array of type Load. !null . !empty
		@param maxCapacity double !null 
		@param minCapacity double !null
	*/
	public Ship(String name, Client[] clients, Load[] loads, double maxCapacity, double minCapacity){
		this.name = name;
		this.clients = clients;
		this.loads = loads;
		this.maxCapacity = maxCapacity;
		this.minCapacity = minCapacity;
	}
	
	// getters and setters
	
	public String getName(){
		return name;
	}
	
	public void setName(String value){
		name = value;
	}
	
	public Client[] getClients(){
		return clients;
	}
	
	public void setClients(Client[] value){
		clients = value;
	}
	
	public Load[] getLoads(){
		return loads;
	}
	
	public void setLoads(Load[] value){
		loads = value;
	}
	
	public double getMaxCapacity(){
		return maxCapacity;
	}
	
	public void setMaxCapacity(double value){
		maxCapacity = value;
	}
	
	public double getMinCapacity(){
		return minCapacity;
	}
	
	public void setMinCapacity(double value){
		minCapacity = value;
	}
	
	// methods
	
	/** 
		Evaluate if the ship can start the trip <br>
		<b>pre:</b> <br>
		<b>post</b> returns true or false if the ship can start the trip or not 
		@return  boolean with the true or false value
	*/
	
	public boolean testShip(){
		int loadsQuantity  = 0;
		double totalWeight = 0;
		boolean choice;
		for (int i = 0; i < loads.length;i++){
			if (loads[i] != null){
				loadsQuantity++;
				totalWeight += loads[i].getTotalWeight();
			} 
		}
		if (loadsQuantity >= 2 || totalWeight > this.minCapacity){
			choice = true;
		} else {
			choice = false;
		}
		return choice;
	}
	
	
	
}

