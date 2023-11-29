package creational.abstractfactorydesign;

public class CompFactory {
	

		public static Computer getComputer(ComputerFactory factory){
			return factory.createComputer();
		}

}
