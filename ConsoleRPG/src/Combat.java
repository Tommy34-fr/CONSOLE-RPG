

public class Combat {
static String attaque;
static java.util.Scanner entree =   new java.util.Scanner(System.in);

	public static void combat(Pj perso, Monstre monstre) {
		while(Pj.perso.isEnVie() && Monstre.isEnVie()) {
			System.out.println("Choisissez votre attaque :");
			System.out.println("Attaque Physique :Entrer P");
			System.out.println("Attaque Magique :Entrer M");
			attaque = entree.next();
			
				if (attaque.equals("P") | attaque.equals("p")) {
					Pj.effectuerAttaquePhysique();
				}
				else if(attaque.equals("M") | attaque.equals("m")) {
					Pj.effectuerAttaqueMagique();
				}
				else {
					System.out.println("Vous avez raté votre touche ! Vous ratez donc votre attaque ! Au tour de l'adversaire.");
					
				}
				
			
			Monstre.effectuerAttaquePhysique();
			System.out.println("PV actuels : " + Pj.perso.getPv());
			}
		if (!(Pj.perso.isEnVie())){
			System.out.println("GAME OVER !");
		}
		else {
			System.out.println("GAGNE !");
			monstre.xpGain();
			perso.levelUp(monstre);
		}
	}
}

