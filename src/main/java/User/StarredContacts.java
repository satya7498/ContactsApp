package User;

public class StarredContacts {
	private String nameS;
	public StarredContacts(String nameS, int mobNoS, String mailIdS) {
		super();
		this.nameS = nameS;
		this.mobNoS = mobNoS;
		this.mailIdS = mailIdS;
	}
	@Override
	public String toString() {
		return "StarredContacts [nameS=" + nameS + ", mobNoS=" + mobNoS + ", mailIdS=" + mailIdS + "]";
	}
	public String getNameS() {
		return nameS;
	}
	public void setNameS(String nameS) {
		this.nameS = nameS;
	}
	public int getMobNoS() {
		return mobNoS;
	}
	public void setMobNoS(int mobNoS) {
		this.mobNoS = mobNoS;
	}
	public String getMailIdS() {
		return mailIdS;
	}
	public void setMailIdS(String mailIdS) {
		this.mailIdS = mailIdS;
	}
	private int mobNoS;
	private String mailIdS;
}
