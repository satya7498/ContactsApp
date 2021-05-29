package userServices;

import User.Diary;
import User.StarredContacts;
import User.UserInfo;

public class userInfoService {

public static UserInfo createDiary(String name, int mobNo, String mailId)
	{
	return new UserInfo(name,mobNo,mailId);
	}

public static StarredContacts createStarred(String nameS, int mobNoS, String mailIdS)
{
return new StarredContacts (nameS,mobNoS,mailIdS);
}
	

public static Diary createStarred() {
	return new Diary ();
}
	public static Diary createDiary() {
		return new Diary ();
	}

	public void clearDiary (Diary d ) {
		d.getItems().clear();
	}
	public void displayContacts (Diary d) {
		d.displayContacts();

	}
}
