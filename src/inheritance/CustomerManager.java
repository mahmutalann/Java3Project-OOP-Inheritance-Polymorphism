package inheritance;

public class CustomerManager {
		/*
		 public void add(IndividualCustomer customer) {
			System.out.println(customer.customerNumber + " added in Individual Customer");
		}
		
		public void add(CorporateCustomer customer) {
			System.out.println(customer.customerNumber + " added in Corporate Customer");
		}
		

		public void add(StrangerCustomer customer) {
			System.out.println(customer.customerNumber + " added in Stranger Customer");
		}
		*/
		
		public void add(Customer customer) { //Polymorphism provides that it can hold a reference to classes that extend the Customer class.
			System.out.println(customer.customerNumber + " added");
		}
		
	
		//Bulk Insert = Each one customer group adds in loop.
		public void addMultiple(Customer [] customers) {
			for (Customer customer : customers) {
				add(customer);
			}
		
		}
}

//SOLID O = Open-Closed Principle
