
public class SalesManager implements SalesService {

	@Override
	public void compaignSale(Gamer gamer, Campaign campaign, Game game) {
		String campaignSale = "kampanyal� sat�� yap�ld�";
		System.out.println(gamer.getFirstName() + "isimli kullac�ya" + game.gameName + "adl� oyun" + campaignSale );
		
	}

	@Override
	public void withoutCampaignSale(Gamer gamer, Game game) {
		String withoutCampaignSale = "  kampanyas�z sat��� yap�ld� ";
		System.out.println(gamer.getFirstName() + "isimli kullac�ya" + game.gameName + "adl� oyun" + withoutCampaignSale );
		
		
	}

	@Override
	public void returnOfSale(Gamer gamer, Game game) {
		String returnOfSale = "iade edildi";
		System.out.println(gamer.getFirstName() + "isimli kullac� taraf�ndan" + game.gameName + "  " +"adl� oyun"+ "  " + returnOfSale );
		
	}


}
