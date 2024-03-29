
public class TheBoss extends Monstre {
	private static final int PV_MAX_BASE = 200;
	private static final int FORCE_BASE = 45;
	private static final int AGI_BASE = 5;
	private static final int INTEL_BASE = 10;
	private static final String NAME = "The BOSS";
	
	public TheBoss() {
		super(NAME, PV_MAX_BASE, FORCE_BASE, AGI_BASE, INTEL_BASE);
	}

	@Override
	protected int xpGain() {
		return 0;
	}
}
