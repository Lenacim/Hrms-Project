package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import core.LoginWithEmail;
import entities.concretes.User;

public class AuthManager implements AuthService {
	
	AuthService authService;
	UserService userService;
	UserValidationService userValidationService;
	
	public AuthManager(AuthService authService, UserService userService, UserValidationService userValidationService) {
		super();
		this.authService = authService;
		this.userService = userService;
		this.userValidationService = userValidationService;
	}


	public AuthManager(Object object, LoginWithEmail loginWithEmail) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean register(User user) {
	    if(!(this.userService.checkMailCorrect(user.getEmail()) &&
                this.userService.getByEmail(user.getEmail()) == null &&
                user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 &&
                user.getPassword().length() >= 6)){
            System.out.println("Kay�t ba�ar�s�z !");
            return false;
	
	}System.out.println("Mail g�nderildi !");
    if(!authService.verified(user.getEmail())){
        System.out.println("Kodu do�ru girmelisiniz!");
        return false;
    }
    System.out.println("Hesab�n�z onayland� ve kayd�n�z yap�ld�.");
    this.userService.add(user);
    return true;
	}

	@Override
	public boolean login(User user) {
		User userToCheck = this.userService.getByEmail(user.getEmail());
        if(userToCheck == null){
            System.out.println("Kay�tl� kullan�c� bulunamad�.");
            return false;
        }
        if(!user.getPassword().equals(userToCheck.getPassword())){
            System.out.println(" Parola yanl�� !");
            return false;
        }
        System.out.println("Giri� ba�ar�l�!");
        return true;
    }
	

	@Override
	public boolean verified(String email) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean verified(User user2) {
		// TODO Auto-generated method stub
		return false;
	}
	



	

	

	


}
