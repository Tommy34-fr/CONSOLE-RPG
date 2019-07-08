
public class ChefOrc extends Monstre {
	private static final int PV_MAX_BASE = 75;
	private static final int FORCE_BASE = 20;
	private static final int AGI_BASE = 5;
	private static final int INTEL_BASE = 5;
	private static final String NAME = "Chef Orc";
	
	public ChefOrc() {
		super(NAME, PV_MAX_BASE, FORCE_BASE, AGI_BASE, INTEL_BASE);
	}
	
	public int xpGain() {
		return Pj.perso.xp += 50;
	}
}