package com.project.sapient.client;

import com.project.sapient.dao.UserRegisterDOO;
import com.project.sapient.entity.UserRegister;
import com.project.sapient.interfaces.IUserRegisterDAO;

public class App {

	public static void main(String[] args) {

		UserRegister user = new UserRegister();

		user.setUserId(12);
		user.setUserName("Jello");
		user.setEmailId("jello@gmail.com");
		user.setPassword("Hello@123");

		IUserRegisterDAO dao = new UserRegisterDOO();

		Boolean b = dao.insertUser(user);
		System.out.println(b);
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
