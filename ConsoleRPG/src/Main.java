
public class Main {
	

	public static void main(String[] args) {
		Partie partie;
		Pj.perso = null;
	//////////INTERFACE ACCEUILLE////////////
		
		
	
	/////////CREATION PERSONNAGE ////////////
	
		Pj.name();
		Pj.selectClass();

	////////////DEBUT PARTIE ///////////////
		
		//if (!sauvegarde)
		{
		partie = new Partie();
		}
		//else
		{
		//Chargement perso + partie
		}
		if (partie.demarrer()) {
			
			System.out.println("Bien Joué ! Vous avez terminé le donjon !");
		} else {
			System.out.println("Perdu, t'es une merde");
		
		

		}
	}
	
}

