
public class ValidatorManager implements ValidatorService{

	@Override
	public boolean validate(User user, Gamer gamer) {
		if(user.getIdentificationNumber() == gamer.getIdentificationNumber()) {
			System.out.println("Kullan�c� do�ruland�!");
			
			return true;
			
		}else {
			System.out.println("Kullan�c� do�rulanamad�!");
			
			return false;
		}
		
	
	}

}
