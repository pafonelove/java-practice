package pistol;

class Pistol {
	int Ammo;
	
	Pistol (int ammo) {
		Ammo = ammo;
	}
	
	Pistol () {
		Ammo = 5;
	}
	
	public void Shot () {
		if (Ammo > 0) {
			System.out.println("Бах");
			Ammo--;
		} else {
			System.out.println("Клац");
		}
	}
}

public class Program {

	public static void main(String[] args) {
		Pistol p = new Pistol(5);
		p.Shot();
		p.Shot();
		p.Shot();
		p.Shot();
		p.Shot();
	}

}
