package service;

public class ContactoServiceFactory {
	
	public static ContactosService getContactosService() {
		return new ContactoServicesBD();
	}
}
