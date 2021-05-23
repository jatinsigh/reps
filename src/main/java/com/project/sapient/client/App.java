package com.project.sapient.client;

import com.project.sapient.dao.UserRegisterDOO;
import com.project.sapient.entity.UserRegister;
import com.project.sapient.interfaces.IUserRegisterDAO;

public class App {

	public static void main(String[] args) {

		IUserRegisterDAO dao = new UserRegisterDOO();

		for (UserRegister user : dao.getAllUserRegisterInfo()) {
			System.out.println(user.getPassword());
		}
		// Boolean b = dao.updatePassword("shumbham@gmail.com", "Shu@12345");
		// System.out.println(b);
	//	IUserProfileDAO dao = new UserProfileDOO();
		// String Email = "jat@gmail.com", pwd = "hi@123";
		
	// IGalleryDao dao = new GalleryDOO();
	/*SocialLinks link = new SocialLinks();
	link.setFacebookUrl("fb.com");
	link.setInstagramUrl("insta.com");
	link.setTwitterUrl("tweet.com");
	link.setUserId(20);
	link.setLinkId(11);
	ISocialLinksDAO dao = new SocialLinksDOO();
	Boolean val = dao.insertUrls(link);
	System.out.println(val);
	}*/
}
}
