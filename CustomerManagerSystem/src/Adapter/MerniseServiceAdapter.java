package Adapter;



import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MerniseServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
	
   	  
		 try {
				KPSPublicSoap client = new KPSPublicSoapProxy();
				
				boolean isValid = client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),
						 customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
				return isValid;
			} catch (Exception e) {
				
				System.out.println("Giriş bilgileri doğru değil");
			}
			
			return false;
      	
 
   	   		
	}

}
