package Concrete;

import Entities.Gamer;

public class GamerManager {
	
	private GamerCheckManager _checkManager;
	
	
	public GamerManager(GamerCheckManager checkManager) {
		super();
		this._checkManager = checkManager;
	}

	
	
	public void Register(Gamer gamer) {
		if(_checkManager.checkIfRealPerson(gamer)) {
			System.out.println("Kayit oldunuz");	
		}else {
			System.out.println("Kayit oldunamadi");
		}
		
	}
	
	public void Login(Gamer gamer) {
		System.out.println("Giris yapriniz");
	}
	
	public void DeleteAccount(Gamer gamer) {
		System.out.println("Hesabiniz guncellendi");
	}
	
	public void UpdateAccount(Gamer gamer) {
		System.out.println("Hesabiniz guncellendi");
	}
	
}
