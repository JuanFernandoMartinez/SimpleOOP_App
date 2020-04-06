package model;

public class Ship{
	public String name;
	public Client[] clients;
	public Load[] loads;
	public double maxCapacity;
	public double minCapacity;
	
	// contrructor
	
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
}

