
public class ValidatorManager implements ValidatorService{

	@Override
	public boolean validate(User user, Gamer gamer) {
		if(user.getIdentificationNumber() == gamer.getIdentificationNumber()) {
			System.out.println("Kullanıcı doğrulandı!");
			
			return true;
			
		}else {
			System.out.println("Kullanıcı doğrulanamadı!");
			
			return false;
		}
		
	
	}

}
