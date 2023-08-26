package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer person = new IndividualCustomer();
		person.id = 111;
		person.customerNumber = "000";
		
		CorporateCustomer store = new CorporateCustomer();
		store.id = 000;
		store.customerNumber = "111";
		
		StrangerCustomer abc = new StrangerCustomer();
		abc.id = 111;
		abc.customerNumber = "000";
		
		CustomerManager customerManager = new CustomerManager();
		/*
		customerManager.add(person);
		customerManager.add(store);
		customerManager.add(abc);
		*/
		Customer [] customers = {person, store, abc};
		customerManager.addMultiple(customers);
	}
}
