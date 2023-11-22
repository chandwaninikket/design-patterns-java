package creational.factorydesign;

public class ClientClass {
	
	public static void main(String[] args) {
		
		Computer computerFactory = ComputerFactory.getComputer("PC");
		System.out.println(computerFactory.getCpu());
	}

}
