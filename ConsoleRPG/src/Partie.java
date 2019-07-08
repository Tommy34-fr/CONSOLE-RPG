
public class Partie {

	static int nbTours = 0;

	public boolean demarrer() {
		while (Partie.nbTours  < 15 && Pj.perso.isEnVie()) {
			this.deroulerTour();
			Partie.nbTours++;
		}
		return Pj.perso.isEnVie();
		
	}

	private void deroulerTour() {
		 String rencontreDuTour = PickUpRencontre.pickUpRencontre(nbTours);
				System.out.println(rencontreDuTour);
				if (rencontreDuTour.equals("Vous tombez sur un Monstre !") & Partie.nbTours <= 4) {
					int d100 = (int) (Math.random()*100.0) + 1;
					if(d100 <= 70) {
						Monstre gobelin = new Gobelin();
						System.out.println("Un " + Monstre.getName() + " vous attaque !");
						Combat.combat(Pj.perso, gobelin);
					}
					else {
						Monstre orc = new Orc();
						System.out.println("Un " + Monstre.getName() + " vous attaque !");
						Combat.combat(Pj.perso, orc);
					}						
				}
				if (Partie.nbTours == 5) {
					Monstre chefOrc = new ChefOrc();
					System.out.println("Un " + Monstre.getName() + " vous attaque !");
					Combat.combat(Pj.perso, chefOrc);
					
				}
				if (rencontreDuTour.equals("Vous tombez sur un Monstre !") & Partie.nbTours > 5 & Partie.nbTours< 10) {
					int d100 = (int) (Math.random()*100.0) + 1;
					if(d100 <= 90){
					Monstre nueeChauveSouris = new NueeChauveSouris();
					System.out.println("Un " + Monstre.getName() + " vous attaque !");
					Combat.combat(Pj.perso, nueeChauveSouris);
					}
					else { 
					Monstre vampire = new Vampire();
					System.out.println("Un " + Monstre.getName() + " vous attaque !");
					Combat.combat(Pj.perso, vampire);
					}
				}
				if (Partie.nbTours == 10) {
					Monstre seigneurVampire = new SeigneurVampire();
					System.out.println("Un " + Monstre.getName() + " vous attaque !");
					Combat.combat(Pj.perso, seigneurVampire);
				}
				if (rencontreDuTour.equals("Vous tombez sur un Monstre !") & Partie.nbTours > 10 & Partie.nbTours < 15) {
					int d100 = (int) (Math.random()*100.0) + 1;
					if(d100 <= 90){
					Monstre guerrierDElite = new GuerrierDElite();
					System.out.println("Un " + Monstre.getName() + " vous attaque !");
					Combat.combat(Pj.perso, guerrierDElite);
					}
					else {
						Monstre veteranDElite = new VeteranDElite();
						System.out.println("Un " + Monstre.getName() + " vous attaque !");
						Combat.combat(Pj.perso, veteranDElite);
						}	
					}
				if (Partie.nbTours == 15) {
					Monstre theBoss = new TheBoss();
					System.out.println("Un " + Monstre.getName() + " vous attaque !");
					Combat.combat(Pj.perso, theBoss);
				}
			
				if ((rencontreDuTour.equals("Vous rencontrez le soigneur !"))) {
					Healer.copiner(Pj.perso);
					Pj.heal();
					System.out.println("Vous etes soigné de " + Healer.pvHeal + " pv ! ");	
					System.out.println("PV actuels : " + Pj.perso.getPv());
					
				}
				if ((rencontreDuTour.equals("Vous rencontrez l'entraineur !"))) {
					System.out.println("L'entraineur vous entraine");	
					Entraineur.copiner(Pj.perso);
					
				}
		}	
}
