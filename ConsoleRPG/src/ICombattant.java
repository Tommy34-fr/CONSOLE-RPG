
public interface ICombattant {


	public int effectuerAttaqueMagique(int degats);
	
	
	public int effectuerAttaquePhysique(int degats);
	
	
	public void takeDamageMagique(int degats);
	
	
	public void takeDamagePhysique(int degats);
	
	
	public int getPv();
	
	public int getLevel();
	
	
	public int getForce() ;
	
	public int getAgi();
	
	public int getIntel();
	
	public default boolean isEnVie() {
		return this.getPv()>0;
	}	

}
