
public class Vampire extends Monstre {
	private static final int PV_MAX_BASE = 100;
	private static final int FORCE_BASE = 20;
	private static final int AGI_BASE = 20;
	private static final int INTEL_BASE = 20;
	private static final String NAME = "Vampire";
	
	public Vampire() {
		super(NAME, PV_MAX_BASE, FORCE_BASE, AGI_BASE, INTEL_BASE);
	}
	public int xpGain() {
		return Pj.perso.xp += 30;
	}
}

