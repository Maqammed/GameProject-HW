package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager  implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) { //Bu Mernis simulasyonu..
		if(gamer.getFirstName().length()<3 && !gamer.getNationalityId().isEmpty()) {
			
			return false;
			
		}else {
			return true;	
		}
		
	}

}
