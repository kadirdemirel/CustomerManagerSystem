
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MerniseServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		 Customer customer = new Customer();
	        customer.setId(1);
	        customer.setFirstName("Abdulkadir");
	        customer.setLastName("Demirel");
	        customer.setDateOfBirth(LocalDate.of(1998, 07, 17));
	        customer.setNationalityId("17201158454");

	        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniseServiceAdapter());
	        customerManager.save(customer);

	}

}
