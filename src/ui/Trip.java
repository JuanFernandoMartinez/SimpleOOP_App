package ui;

import model.*;
import java.util.Scanner;
public class Trip{
	
	static Scanner sc = new Scanner(System.in);
	private Client[] clients = new Client[5];
	private Load[] loads = new Load[5];
	private Ship ship ;
	
	/** 
	this method will print 5 items which will help the user to advace in the application flow <br/>
	<b>pre:</b>   <br/>
	<b>post:</b> print the options which will be chosen by user <br/>
	
	*/
	public void menu(){
		int choice;
		
		System.out.println("1. Registrar infromacion de los clientes ");
		System.out.println("2. Cargar el barco");
		System.out.println("3. verificar el viaje");
		System.out.println("4. Descargar el barco");
		System.out.println("5. Salir");
		System.out.println("Elija el numero de la opcion que desea elegir");
		choice = sc.nextInt();
		sc.nextLine();
		
		while (choice <1 || choice > 5 ){
				System.out.println("por favir digite una eleccion valida");
				sc.nextLine();
		}
		switch(choice){
			case 1: clientRegisterArray(); break;
			case 2: startLoad(); break;
			case 3: testLoad(); break;
			//case 4: downLoad(): break;
			case 5: System.out.println("Gracias por usar nuestro programa");
			
		}
		
	}
	
	
	/** 
		Fill the clients array with information given by the user <br>
		<b>pre:</b> <br>
		<b>post:</b> the clients array will be filled with Client objects
	*/
	public void clientRegisterArray(){
		for (int i = 0; i<5; i++ ){
			System.out.println("Cliente #"+(i+1));
			clients[i] = clientRegister();
		}
		
		menu();
	}
	
	
	/** 
	Create a client with the information typed by user <br>
	<b>pre:</b> <br>
	<b>post:</b> returns a object with type Client
	
	*/
	public Client clientRegister(){
		System.out.println("digite el nombre del cliente");
		String name = sc.nextLine();
		
		System.out.println("digite el codigo de registro del cliente ");
		String code = sc.nextLine();
		
		System.out.println("digite el numero respectivo al  tipo de cliente; normal");
		System.out.println("1. normal");
		System.out.println("2. plata");
		System.out.println("3. oro");
		System.out.println("4. platinum");
		int type = sc.nextInt(); sc.nextLine();
		
		System.out.println("digita la fecha en formato dia,mes,año no olvide utilizar las comas ,");
		String date = sc.nextLine();
		String[] dateFields = date.split(",");
		Date registrationDate = new Date(Integer.parseInt(dateFields[2]),Integer.parseInt(dateFields[1]), Integer.parseInt(dateFields[0]));
		
		Client client = new Client(name,code,registrationDate,type);
		
		return client;
		
	}
	
	/** 
		fills the Load array <br>
		<b>pre:</b> the load array must has been created <br>
		<b>port:</b> fills the load array with objects created by the user information 
	*/
	public void startLoad(){
		for (int i = 0; i<loads.length; i++){
			loads[i] = instantiateLoad();
			
		}
		ship = new Ship("El Pirata", clients, loads, 28000, 12000);
		menu();
	}
	
	/** 
		Create a Load object with the user specifications <br>
		<b>pre:</b> <br>
		<b>post:</b> returns a Load object with the information given by the user <br>
	*/
	public Load instantiateLoad(){
		System.out.println("digite la cantidad de cajas");
		int boxes = sc.nextInt(); sc.nextLine();
		
		System.out.println("digite el peso por caja");
		double weightPerBox = sc.nextDouble(); sc.nextLine();
		
		System.out.println("digite el numero equivalente al tipo de carga");
		System.out.println("1. peligrosa");
		System.out.println("2. perecedera");
		System.out.println("3. no perecedera");
		
		int type = sc.nextInt(); sc.nextLine();
		
		System.out.println("Elija al cliente a quien pertenece la carga");
		for (int i = 0; i<clients.length;i++){
			System.out.println((i+1)+". "+clients[i].getName());
		}
		
		int clientA = sc.nextInt(); sc.nextLine();
		while(clientA < 1 || clientA > 5){
			System.out.println("debe elegir una opcion valida");
			clientA = sc.nextInt(); sc.nextLine();
		}
		
		
		
		Load load = new Load(boxes, weightPerBox, clients[clientA-1],type);
		
		return load;
	}
	
	public void testLoad(){
		
	}
	
	
	
	
	
	
	
}