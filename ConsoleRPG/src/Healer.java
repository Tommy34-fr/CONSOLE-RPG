
public class Healer extends Ami {

	public static int pvHeal;

	
	public static int copiner(Pj perso) {
		pvHeal = (int) (Pj.getPvMax()*0.25);
		return pvHeal;
		
	}

}
