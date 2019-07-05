
public abstract class Player {
	String playerName;
	String Skill;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;

	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public abstract void create();
	public abstract void update();
	public abstract void deleting();
	public abstract void fetch();

}