package Concrete;



import Abstract.CustomerCheckService;
import Entities.Customer;
 class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
    	 return  true;
    	 }
}
    
   


