
public class TheBoss extends Monstre {
	private static final int PV_MAX_BASE = 35;
	private static final int FORCE_BASE = 2;
	private static final int AGI_BASE = 3;
	private static final int INTEL_BASE = 1;
	private static final String NAME = "The BOSS";
	
	public TheBoss() {
		super(NAME, PV_MAX_BASE, FORCE_BASE, AGI_BASE, INTEL_BASE);
	}
}
