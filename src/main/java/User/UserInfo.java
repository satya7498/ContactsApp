package User;

public class UserInfo {
	
	private String name;
	private int mobNo;
	private String mailId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobNo() {
		return mobNo;
	}
	public UserInfo(String name, int mobNo, String mailId) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.mailId = mailId;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", mobNo=" + mobNo + ", mailId=" + mailId + "]";
	}

}
