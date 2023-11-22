package creational.factorydesign;

public  class ComputerFactory {
	
	public static Computer getComputer(String name) {
		switch(name) {
		case "PC":
			return new PC();
		case "Server":
			return new Server();
		default:
			return null;
		}
	}

}
