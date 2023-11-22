package creational.factorydesign;

public class Server implements Computer {

	@Override
	public String getRam() {
		System.out.println("Ram for " + getClass().getName());
		return null;
	}

	@Override
	public String getCpu() {
		System.out.println("CPU for " + getClass().getName());
		return null;
	}

	@Override
	public String getOs() {
		System.out.println("OS for " + getClass().getName());
		return null;
	}

	@Override
	public String getStorage() {
		System.out.println("Storage for " + getClass().getName());
		return null;
	}

}
