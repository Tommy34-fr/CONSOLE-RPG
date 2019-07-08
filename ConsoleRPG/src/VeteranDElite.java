
public class VeteranDElite extends Monstre {
	private static final int PV_MAX_BASE = 80;
	private static final int FORCE_BASE = 20;
	private static final int AGI_BASE = 15;
	private static final int INTEL_BASE = 10;
	private static final String NAME = "Vétéran d'élite";
	
	public VeteranDElite() {
		super(NAME, PV_MAX_BASE, FORCE_BASE, AGI_BASE, INTEL_BASE);
	}
	public int xpGain() {
		return Pj.perso.xp += 50;
	}
}
