package interfaceAbstractDemo;


public class StarbucksCustomerManager extends BaseCustomerManager {
	
CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	 public void Save(Customer customer) {
		 if(customerCheckService.checkIfRealPerson(customer)) {
			 super.Save(customer);
			 System.out.println("Do�rulama ba�ar�l� !"); 
		 }
		 else {
			System.out.println("Do�rulama ba�ar�s�z !"); 
		 }
	
}
}