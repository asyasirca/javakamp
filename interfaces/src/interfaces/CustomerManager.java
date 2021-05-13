package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	// CustomerManager loglamaya baðlý.
	// 2 tür baðýmlýlýk vardýr:
	// loosly coupled:gevþek baðlý...tightly coupled:katý baðlý
	// biz sistemi loglamaya katý baðladýk.bunlarý gevþek baðýmlýlýklar haline
	// getirmemiz lazým.

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {
		System.out.println("Müþteri silindi" + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());

	}

}
