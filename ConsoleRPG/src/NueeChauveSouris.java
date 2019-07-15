
public class NueeChauveSouris extends Monstre {
	
	private static final int PV_MAX_BASE = 40;
	private static final int FORCE_BASE = 20;
	private static final int AGI_BASE = 4;
	private static final int INTEL_BASE = 1;
	private static final String NAME = "Nuée de chauve-souris";
	
	public NueeChauveSouris() {
		super(NAME, PV_MAX_BASE, FORCE_BASE, AGI_BASE, INTEL_BASE);
	}
	public int xpGain() {
		return Pj.perso.xp += 25;
	}
}

