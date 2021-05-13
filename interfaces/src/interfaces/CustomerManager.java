package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	// CustomerManager loglamaya ba�l�.
	// 2 t�r ba��ml�l�k vard�r:
	// loosly coupled:gev�ek ba�l�...tightly coupled:kat� ba�l�
	// biz sistemi loglamaya kat� ba�lad�k.bunlar� gev�ek ba��ml�l�klar haline
	// getirmemiz laz�m.

	public void add(Customer customer) {
		System.out.println("M��teri eklendi: " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {
		System.out.println("M��teri silindi" + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());

	}

}
