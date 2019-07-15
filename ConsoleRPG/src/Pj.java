
public abstract class Pj{
	static Pj perso;
	static String choix;
	protected static int pvBaseMax;
	protected static int forceBase;
	protected static int agiBase;
	protected static int intelBase;
	protected static int multiForce;
	protected static int multiAgi;
	protected static int multiIntel;

	protected static int pv;
	protected static int level = 0;
	protected int xp = 0;
	protected static String name;
	
	static java.util.Scanner entree =   new java.util.Scanner(System.in);
	
	public static void name() {
		
		System.out.println("Entrez le nom du personnage : ");
		name = entree.next();
	
		
	}
	
	public static void selectClass() {
		System.out.println("Veuillez choisir votre personnage");
		System.out.println("Guerrier - Voleur - Mage :");
		choix = entree.next();
		
		if(choix.equals("Guerrier")) {
			perso = new War();
		}
		else if(choix.equals("Voleur")) {
			perso = new Voleur();
		}
		else {
			perso = new Mage();
		}
		System.out.println("Nom   : " + perso.getName());
		System.out.println("Classe: " + choix);
		System.out.println("Niv   : " + perso.getLevel());
		System.out.println("PV    : " + perso.getPv());
		System.out.println("Force : " + Pj.getForce());
		System.out.println("Agi   : " + Pj.getAgi());
		System.out.println("Intel : " + Pj.getIntel());
	}
	
	public Pj(int level, int pvBaseMax, int forceBase, int agiBase, int intelBase, int multiForce, int multiAgi, int multiIntel) {
		Pj.level = level;
		Pj.pvBaseMax = pvBaseMax;
		Pj.forceBase = forceBase;
		Pj.agiBase = agiBase;
		Pj.intelBase = intelBase;
		Pj.multiForce = multiForce;
		Pj.multiAgi = multiAgi;
		Pj.multiIntel = multiIntel;

		Pj.pv = pvBaseMax;
	}

	public static void heal() {
		if ((pv + Healer.pvHeal) > getPvMax()) {
			pv = getPvMax();
		} else {
			pv += Healer.pvHeal;
		}
	}

	public String getName() {
		return name;
	
	}
	
	public static int getPvMax() {
		return pvBaseMax = pvBaseMax + (level * (10 / 100) * (pvBaseMax));
	}

	public int getPv() {
		return pv;

	}

	public int getLevel() {
		return level;
	}

	public static int getForce() {
		return forceBase + level * multiForce;

	}

	public static int getAgi() {
		return agiBase + level * multiAgi;

	}

	public static int getIntel() {
		return intelBase + level * multiIntel;

	}

	public boolean isEnVie() {
		if (getPv() > 0) {
			return true;

		} else {
			return false;
		}
	}
	
	
	public static void effectuerAttaqueMagique() {
		
		int degats = getIntel() + ((int) (Math.random()*6.0) + 1);
		Monstre.pv = Monstre.pv - degats;
		System.out.println("Vous avez infligé "+ degats + " à l'ennemie");
			
	}
	public static int effectuerAttaquePhysique() {
	
		int degats = getForce() + ((int) (Math.random()*6.0) + 1);
		Monstre.pv = Monstre.pv - degats;
		System.out.println("Vous avez infligé "+ degats + " à l'ennemie");
		return degats;
		
	}

	public void levelUp(Monstre monstre) {
		if (xp == 50) {
			level = level + 1;
			xp = 0;
			System.out.println("Vous gagnez un niveau ! ");
			System.out.println("niveau actuel : " + getLevel());
			
		}
		else if (xp > 50) {
			level = level + 1;
			int diffXp = 50 - xp;
			xp = monstre.xpGain() - diffXp;
			System.out.println("Vous gagnez un niveau ! ");
			System.out.println("niveau actuel : " + getLevel());
		}
		
	}
	
		
}


