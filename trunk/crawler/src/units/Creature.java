package crawler.src.units;
//platano con yuca... tu sabe probando si esto funciona
public class Creature {
	int x,y,z,hp,
	stamina,strength,dexterity,
	constitution,inteligence,
	speedOfMind,willpower,defenceMod;
	
	public int getDefenceMod() {
		return defenceMod;
	}

	public void setDefenceMod(int defenceMod) {
		this.defenceMod = defenceMod;
	}

	public boolean attack(Creature target){
		if(		this.getDexterity()+this.getSpeedOfMind()+
				this.getStrength() >= 
				target.getDexterity()+target.getSpeedOfMind()+
				target.getDefenceMod())
			return true;
		else
			return false;

	}	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getInteligence() {
		return inteligence;
	}

	public void setInteligence(int inteligence) {
		this.inteligence = inteligence;
	}

	public int getSpeedOfMind() {
		return speedOfMind;
	}

	public void setSpeedOfMind(int speedOfMind) {
		this.speedOfMind = speedOfMind;
	}

	public int getWillpower() {
		return willpower;
	}

	public void setWillpower(int willpower) {
		this.willpower = willpower;
	}


}
