
public class Orc extends Monstre {
	private static final int PV_MAX_BASE = 50;
	private static final int FORCE_BASE = 12;
	private static final int AGI_BASE = 3;
	private static final int INTEL_BASE = 1;
	private static final String NAME = "Gobelin";
	
	public Orc() {
		super(NAME, PV_MAX_BASE, FORCE_BASE, AGI_BASE, INTEL_BASE);
	}
	public int xpGain() {
		return Pj.perso.xp += 30;
	}
}

