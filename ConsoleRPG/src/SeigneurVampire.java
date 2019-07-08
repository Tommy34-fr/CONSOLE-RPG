
public class SeigneurVampire extends Monstre {
	private static final int PV_MAX_BASE = 150;
	private static final int FORCE_BASE = 30;
	private static final int AGI_BASE = 50;
	private static final int INTEL_BASE = 30;
	private static final String NAME = "Seigneur Vampire";
	
	public SeigneurVampire() {
		super(NAME, PV_MAX_BASE, FORCE_BASE, AGI_BASE, INTEL_BASE);
	}
	
	public int xpGain() {
		return Pj.perso.xp += 50;
	}
}
