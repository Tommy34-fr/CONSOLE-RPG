
public abstract class Monstre{
	protected static String name;
	protected int pvBaseMax;
	protected static int forceBase;
	protected int agiBase;
	protected static int intelBase;
	
	
	protected static int pv;

	
	public Monstre(String name, int pvBaseMax, int forceBase, int agiBase, int intelBase) {
		Monstre.name = name;
		this.pvBaseMax = pvBaseMax;
		Monstre.forceBase = forceBase;
		this.agiBase = agiBase;
		Monstre.intelBase = intelBase;

		Monstre.pv = pvBaseMax;
	}
	
	public Monstre() {
	
	}
	
	public static String getName() {
		return name;
	}

	public int getPvMax() {
		return pvBaseMax;
	}

	public static int getPv() {
		return pv;

	}

	public static int getForce() {
		return forceBase;

	}

	public int getAgi() {
		return agiBase;
	}

	public static int getIntel() {
		return intelBase;

	}

	public static boolean isEnVie() {
		if (getPv() > 0) {
			return true;

		} else {
			return false;
		}
	}
	
	public static int effectuerAttaquePhysique() {
		
		int degats = getForce() + (int) (Math.random()*6.0) + 1;
		Pj.pv = Pj.pv - degats;
		System.out.println("L'ennemie vous a infligé "+ degats + "degats.");
		return degats;
		
	}

	protected abstract int xpGain();


}
