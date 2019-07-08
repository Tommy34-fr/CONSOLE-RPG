
public class PickUpRencontre {
	static String rencontre;
	public static String pickUpRencontre(int tour) {
		
		int d100 = (int) (Math.random()*100.0) + 1;
		
		if(d100 <= 70 || tour == 5 || tour == 10 || tour == 15) {
		
			return rencontre = "Vous tombez sur un Monstre !";
			
		}
		
		else if (d100 > 70 && d100 < 90 ){
			
			return rencontre = "Vous rencontrez l'entraineur !";
		}
		
		else {
			return rencontre = "Vous rencontrez le soigneur !";
		}
	}
}
