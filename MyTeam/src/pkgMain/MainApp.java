package pkgMain;

import pkgData.Player;

public class MainApp {
	public static void main(String[] args) {
		Player player = new Player(2, "Dragovic", "Defense");
		System.out.println("==" + player);
		Player player2 = new Player(4, "Bratan", "Defense");
		System.out.println("==" + player2);
	
		player = new Player(8, "Baumgartner", "thomas");
		System.out.print("== " + player);
		
		player = new Player(7, "Baumgartner", "thomas");
		System.out.println("== " + player);
	}
	
	
}
