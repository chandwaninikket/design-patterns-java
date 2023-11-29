package creational.abstractfactorydesign;

public class LaptopFactory implements ComputerFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public LaptopFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}
}
